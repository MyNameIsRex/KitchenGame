#include "Game.hpp"

Game::Game(int width, int height, string title)
{
	this -> mWidth = width;
	this -> mHeight = height;
	this -> mTitle = title;

	this -> mWindow = new RenderWindow(VideoMode(this -> mWidth, this -> mHeight), this -> mTitle);
	this -> Initialize();
}

Game::~Game()
{
	delete this -> mWindow;
}

void Game::Initialize()
{
	this->Run();
}

void Game::Run()
{
	while (this -> mWindow -> isOpen())
	{
		while (this -> mWindow -> pollEvent(this -> mEvent))
		{
			this -> Update();
			this -> Render();
		}
	}
}

void Game::Update()
{
	if (this -> mEvent.type == Event::Closed)
	{
		this -> mWindow->close();
	}
}

void Game::Render()
{
	this -> mWindow->clear();

	this -> mWindow->display();
}