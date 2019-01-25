package com.designpatters.Adpaterdesign;

public class Bombdevpimpl extends Bomb implements Bombdevp {
	
	public Energy getbombformining()  {
		return getJoule();
	}
	
	public Energy getbombfordefence()
	{
		Energy v=getJoule();
		return convert(v,100);
	}
	private Energy convert(Energy v, int i) {
		return new Energy(v.getJoules()*i);
	}

}
