class EmailRunner{
	
	public static void main(String[] values)
	{
		boolean fire=true;
		Email.sendMessage(fire);
		
		String ms="Today is monday";
		boolean flag= Email.receiveMessage(ms);
		System.out.println(fire==flag);
	}
}