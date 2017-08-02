class X
{
	public static void main(String[] args) 
	{
		int x=0;
		int[] size=new int[5];
		int[] temp=new int[size.length*2];
		size[0]=00;
		size[1]=11;
		size[2]=22;
		size[3]=33;
		size[4]=44;
        for(int i=0;i<size.length;i++)
        {
        	temp[i]=size[i];
        }
        size=temp;
        System.out.println(size.length);
	}
}