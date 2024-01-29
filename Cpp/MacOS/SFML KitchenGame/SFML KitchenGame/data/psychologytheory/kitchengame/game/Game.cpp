//
//  Game.cpp
//  SFML KitchenGame
//
//  Created by Rex Huang on 2024/1/28.
//  Copyright © 2024 PsychologyTheory. All rights reserved.
//

#include "Game.hpp"

Game::Game(int width, int height, string title)
{
    this->mWidth = width;
    this->mHeight = height;
    this->mTitle = title;
    
    this->mWindow = new RenderWindow(VideoMode(this -> mWidth, this -> mHeight), this -> mTitle);
    Logger::LogInfo("Window has been created");
    
    this->mGameStateMngr = new GameStateManager();
    Logger::LogInfo("Game State Manager has been created!");
    
    this->Initialize();
}

Game::~Game()
{
    Logger::LogWarning("Game State Manager to be destroyed!");
    delete this->mGameStateMngr;
    
    Logger::LogWarning("Window to be destroyed!");
    delete this->mWindow;
}

void Game::Initialize()
{
    Logger::LogInfo("Initialization Complete!");
    this->Run();
}

void Game::Run()
{
    while (this->mWindow->isOpen())
    {
        while (this->mWindow->pollEvent(this->mEvent))
        {
            if (this->mEvent.type == Event::Closed)
            {
                this->mWindow->close();
            }
            
            this->Update();
            this->Render();
        }
    }
}

void Game::Update()
{
    Logger::LogInfo("Updating!");
    //Update Stuff Here
    this->mGameStateMngr->UpdateCurrentGameState();
}

void Game::Render()
{
    Logger::LogInfo("Rendering");
    this->mWindow->clear();
    
    //Render Stuff Here
    this->mGameStateMngr->RenderCurrentGameState();
    
    this->mWindow->display();
}
