package producerConsumer;

import java.util.concurrent.LinkedBlockingDeque;

public class Stack
{
	

	/**
	 * 用于保存数据的仓库
	 */
	private LinkedBlockingDeque<String> Data;

	/**
	 * 初始化
	 * 
	 * @param maxSize
	 *            最大数据行数
	 */
	public Stack(int maxSize)
	{
		this.Data = new LinkedBlockingDeque<String>(maxSize);

	}

	/**
	 * 向栈中添加数据
	 * 
	 * @param str
	 *            栈中需要添加的数据
	 * @throws InterruptedException
	 */
	public void Push(String str) throws InterruptedException
	{
		Data.put(str);
	}
	

	/**
	 * 获取栈中的数据，如果没有数据就返回null
	 * 
	 * @return 返回的栈的最顶端的数据
	 * @throws InterruptedException
	 */
	public String Pop() throws InterruptedException
	{
		return this.Data.take();
	}

	/**
	 * 得到仓库数据行数。
	 * 
	 * @return
	 */
	public int getSize()
	{
		return Data.size();
	}

}
