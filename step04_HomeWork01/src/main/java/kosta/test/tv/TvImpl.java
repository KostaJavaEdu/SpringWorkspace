package kosta.test.tv;

import kosta.test.service.Player;

public class TvImpl implements Player {

	@Override
	public void start(int start) {
		System.out.println("TvImpl start(int start) 호출");

	}

	@Override
	public String pause() {
		System.out.println("TvImpl pause() 호출");
		return null;
	}

	@Override
	public void stop() {
		System.out.println("TvImpl stop() 호출");

	}

}
