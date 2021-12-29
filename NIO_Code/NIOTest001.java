
/*
*一, 缓冲区(Buffer)的概念:
     缓冲区在NIO周负责存储数据，然后在一种类似现实中铁轨的上来回传送数据，与IO单向水管式的传送有区别；

*二, 根据数据类型不同提供不同的缓冲区类型(没有boolean的buffer)
     ByteBuffer
	 CharBuffer
	 ShotBuffer
	 IntBuffer
	 LongBuffer
	 FloatBuffer
	 DoublerBuffer
	 这几种Buffer缓冲区的管理方式一样，首先调用allocate(..)方法创建一块缓冲区 
*三, 缓冲区类有两个主要方法
	 put(): 向缓冲区存数据
	 get(): 获取缓冲区的数据
*
*/


public class NIOTest001 {

	public static void main(String[] args){
		ByteBuffer buf = new ByteBuffer();

	}
}