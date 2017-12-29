int k;
int x;
out <- st_i;
out <- k + 3;
out <- (x + k) / 3;
static int st_i;
st_k <- 100;
out <- st_k;

{
	int y;
	y <- st_i;
    out <- y;
    st_k <- 1234;
    y <- st_k;
    out <- y;
            {
        		int z;
        		z <- 2 * y;
        		out <- z;
        		out <- st_i;
        	}
        	y <- st_i;
            out <- y;
            {
                int x;
                y <- x + 3;
                out <- x + y + st_j;
                static int st_j;
            }
}
static int st_k;