
class node {
	protected int data;
	protected node link;

public node() 
{
	link = null;
	data = 0;
}
public node(int d, node n)
{
	link = n;
	data = d;
}

public void setlink(node n)
{
	link = n;
}

public void setdata(int d)
{
	data = d;
}

public node getlink()
{
	return link;
}
public int getdata()
{
	return data;
}
}
