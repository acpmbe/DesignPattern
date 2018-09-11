package producerConsumer;

public class Producer implements Runnable
{

	private Stack Stack;

	/**
	 * 初始化
	 * 
	 * @param stack
	 *            数据仓库
	 */
	public Producer(Stack stack)
	{
		this.Stack = stack;
	}

	@Override
	public void run()
	{
		int Num = 0;

		for (int i = 0; i < 10; i++)
		{
			try
			{

				Num++;
				System.out.println("生产者开始放入仓库：" + System.currentTimeMillis());

				this.Stack.Push(String.valueOf(Num));

				System.out.println("生产者放入仓库完毕：" + System.currentTimeMillis());
				System.out.println("生产完后：" + Stack.getSize() + "条数据");

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
