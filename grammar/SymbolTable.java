import java.util.*;

public class SymbolTable {

	// Static members region

	public static SymbolTable top;
	
	private static Stack<SymbolTable> stack = new Stack<SymbolTable>();
	
	private static Queue<SymbolTable> queue = new LinkedList<SymbolTable>();

	private static int definitionsCount = 0;

	// Use it in pass1 scope start
	public static void push(SymbolTable symbolTable) {
		if(top != null)
			stack.push(top);
		top = symbolTable;
		queue.offer(symbolTable);
	}

	// Use it in pass1, pass2 scope end
	public static void pop() {
		top = stack.pop();
	}

	// Use it in pass2 scope start
	public static void push() {
		push(queue.remove());
	}

	// Use it in pass2, where an item with property "defMustBeComesBeforeUse == true" is defined
	public static void define() {
		++definitionsCount;
	}

	// End of static members region

	public SymbolTable() {
		this(null);
	}

	public SymbolTable(SymbolTable pre) {
		this.pre = pre;
		this.items = new HashMap<String, SymbolTableItem>();
		this.offsets = new HashMap<Register, Integer>();
	}

	public void put(SymbolTableItem item) throws ItemAlreadyExistsException {

		if(items.containsKey(item.getKey())){
			throw new ItemAlreadyExistsException(item.getKey());
		}

		items.put(item.getKey(), item);

		if(item instanceof SymbolTableVariableItemBase) {
			SymbolTableVariableItemBase castedItem = (SymbolTableVariableItemBase) item;
			setOffset(
				castedItem.getBaseRegister(),
				getOffset(castedItem.getBaseRegister()) + castedItem.getSize()
			);
		}
	}

	public int getOffset(Register baseRegister) {
		if(!offsets.containsKey(baseRegister)){
		   return 0;
		}
		return offsets.get(baseRegister);
	}

	public void setOffset(Register baseRegister, int value) {
		offsets.put(baseRegister, value);
	}

	public SymbolTableItem getInCurrentScope(String key) {
		return items.get(key);
	}

	public SymbolTableItem get(String key) {
		SymbolTableItem value = items.get(key);
		// System.out.println(items);
		// System.out.println(pre);
		// System.out.println(value);

		if(value == null && pre != null)
			return pre.get(key);

		// System.out.println(" .. " + SymbolTable.definitionsCount + " - " + value.getDefinitionNumber());
		if(value != null && value.useMustBeComesAfterDef() &&
				SymbolTable.definitionsCount <= value.getDefinitionNumber()) {
			if(pre != null) 
				return pre.get(key);
			else 
				return null;
		}

		return value;
	}

	public SymbolTable getPreSymbolTable() {
		return pre;
	}
	public void updateLocalStackSize(int stackSize) {
		_stackSize = stackSize;
	}
	public int localStackSize() {
		return _stackSize;
	}

	public void printItems() {
		System.out.println(items);
	}

	SymbolTable pre;
	HashMap<String, SymbolTableItem> items;
	HashMap<Register, Integer> offsets;

	int _stackSize;
}