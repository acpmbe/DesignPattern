package producerConsumer;

public class Consumer implements Runnable
{

	private Stack Stack;

	/**
	 * 初始化
	 * 
	 * @param stack
	 *            数据仓库
	 */
	public Consumer(Stack stack)
	{
		this.Stack = stack;
	}

	@Override
	public void run()
	{

		while (true)
		{
			try
			{

				System.out.println("消费者开始取数据：" + System.currentTimeMillis());

				String content = this.Stack.Pop();
				System.out.println("消费者渠道数据是：" + content);

				System.out.println("消费者取数据完毕：" + System.currentTimeMillis());
				System.out.println("消费者取完数据还有：" + Stack.getSize() + "条数据");

				System.out.println();
			}
			catch (InterruptedException e)
			{
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}

	}

}
