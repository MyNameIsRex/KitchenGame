#pragma once

#include <iostream>
#include <SFML/Graphics.hpp>

using namespace std;
using namespace sf;

class Game
{
	int mWidth, mHeight;
	string mTitle;

	RenderWindow *mWindow;
	Event mEvent;

public:
	Game(int width, int height, string title);

	virtual ~Game();

	void Initialize();

	void Run();

	void Update();

	void Render();

	//Getter and Setter
	int getWidth()
	{
		return this->mWidth;
	}

	int getHeight()
	{
		return this->mHeight;
	}

	string getTitle()
	{
		return this->mTitle;
	}
};