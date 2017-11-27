int k <- 2;
int x <- 34;
out <- k + 3;
out <- (x + k) / 3;
{
	int y;
	y <- (x + k) / 6;
	out <- y;
	{
		int z <- y;
		z <- 2 * y;
		out <- z;
	}
	{
		int x <- z + 2;
		int y <- z + 3;
		out <- x + y;
	}
}