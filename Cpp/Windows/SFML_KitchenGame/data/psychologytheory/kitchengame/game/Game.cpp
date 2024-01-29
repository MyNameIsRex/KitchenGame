#include "Game.hpp"

Game::Game(int width, int height, string title)
{
	this->mWidth = width;
	this->mHeight = height;
	this->mTitle = title;

	this->mWindow = new RenderWindow(VideoMode(this -> mWidth, this -> mHeight), this -> mTitle);
	Logger::LogInfo("Window has been created!");

	this->mGameStateMngr = new GameStateManager();

	this->Initialize();
}

Game::~Game()
{
	Logger::LogWarning("Game State Manager to be destroyed!");
	delete this->mGameStateMngr;

	Logger::LogWarning("Window to be destroyed!");
	delete this->mWindow;

	Logger::LogWarning("Ending program!");
}

void Game::Initialize()
{
	this->mGameStateMngr->AddGameStates();

	Logger::LogInfo("Initialization Complete!");
	this->Run();
}

void Game::Run()
{
	while (this->mWindow->isOpen())
	{
		while (this->mWindow->pollEvent(this->mEvent))
		{
			this->Update();
			this->Render();
		}
	}
}

void Game::Update()
{
	Logger::LogInfo("Updating!");

	if (this->mEvent.type == Event::Closed)
	{
		this->mWindow->close();
	}

	this->mGameStateMngr->UpdateCurrentGameState();
}

void Game::Render()
{
	Logger::LogInfo("Rendering!");

	this->mWindow->clear();

	this->mGameStateMngr->RenderCurrentGameState();

	this->mWindow->display();
}