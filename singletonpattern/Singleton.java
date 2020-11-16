public class Singleton {
		public static void main(String[] args) {
	    SingletonObjectCreation singletonObject = SingletonObjectCreation.getInstance();
	    singletonObject.print();
		}

	}
	class SingletonObjectCreation
	{
		static SingletonObjectCreation obj = new SingletonObjectCreation();
		private SingletonObjectCreation()
		{
			
		}
		public static SingletonObjectCreation getInstance()
		{
			return obj;
		}
		public void print()
		{
			System.out.println("This method is called by a SingletonClass Object");
		}
}
