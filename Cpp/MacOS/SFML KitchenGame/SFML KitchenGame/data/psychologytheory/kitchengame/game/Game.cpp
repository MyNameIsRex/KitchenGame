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
    this -> mWidth = width;
    this -> mHeight = height;
    this -> mTitle = title;
    
    this -> mWindow.create(VideoMode(this -> mWidth, this -> mHeight), this -> mTitle);
    this -> Initialize();
}

void Game::Initialize()
{
    this -> Run();
}

void Game::Run()
{
    while (this -> mWindow.isOpen())
    {
        while (this -> mWindow.pollEvent(this -> mEvent))
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
        this -> mWindow.close();
    }
}

void Game::Render()
{
    
}
