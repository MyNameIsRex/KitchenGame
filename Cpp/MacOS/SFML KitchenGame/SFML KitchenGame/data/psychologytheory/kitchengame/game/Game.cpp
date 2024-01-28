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
    this -> mLogger = new Logger;
    
    this -> mWidth = width;
    this -> mHeight = height;
    this -> mTitle = title;
    
    this -> mWindow = new RenderWindow(VideoMode(this -> mWidth, this -> mHeight), this -> mTitle);
    this -> mLogger -> LogInfo("Window has been created");
    
    this -> Initialize();
}

Game::~Game()
{
    delete this -> mWindow;
    this -> mLogger -> LogWarning("Logger to be destroyed!");
    delete this -> mLogger;
}

void Game::Initialize()
{
    this -> mLogger -> LogInfo("Initialization Complete!");
    this -> Run();
}

void Game::Run()
{
    while (this -> mWindow->isOpen())
    {
        while (this -> mWindow -> pollEvent(this -> mEvent))
        {
            if (this -> mEvent.type == Event::Closed)
            {
                this -> mWindow -> close();
            }
            
            this -> Update();
            this -> Render();
        }
    }
}

void Game::Update()
{
    this -> mLogger -> LogInfo("Updating!");
    //Update Stuff Here
}

void Game::Render()
{
    this -> mLogger -> LogInfo("Rendering");
    this -> mWindow -> clear();
    
    //Render Stuff Here
    
    this -> mWindow -> display();
}
