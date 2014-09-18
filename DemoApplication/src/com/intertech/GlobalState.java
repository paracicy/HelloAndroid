//http://www.intertech.com/Blog/androids-application-class/
package com.intertech;

import android.app.Application;

public class GlobalState extends Application {
	
	private int gameScore = 0;

	public int getGameScore() {
		return gameScore;
	}

	public void setGameScore(int gameScore) {
		this.gameScore = gameScore;
	}
	
	public void incrementScore(){
		gameScore++;
	}
	
}
