package producerConsumer;

import iInterface.ICmd;

public class Main implements ICmd
{

	@Override
	public void Run()
	{

		Stack stack = new Stack(3);

		Thread Producer_Thread = new Thread(new Producer(stack));
		Producer_Thread.start();

		Thread Consumer_Thread = new Thread(new Consumer(stack));
		Consumer_Thread.start();

	}

}
