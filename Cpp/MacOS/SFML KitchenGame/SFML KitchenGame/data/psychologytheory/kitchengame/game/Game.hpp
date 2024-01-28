//
//  Game.hpp
//  SFML KitchenGame
//
//  Created by Rex Huang on 2024/1/28.
//  Copyright © 2024 PsychologyTheory. All rights reserved.
//

#pragma once
#ifndef Game_hpp
#define Game_hpp

#include <iostream>
#include <SFML/Graphics.hpp>

#endif /* Game_hpp */

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
    
    //Getters and Setters
    int getWidth()
    {
        return this -> mWidth;
    }
    
    int getHeight()
    {
        return this -> mHeight;
    }
    
    string getTitle()
    {
        return this -> mTitle;
    }
    
    void setWidth(int width)
    {
        this -> mWidth = width;
    }
    
    void setHeight(int height)
    {
        this -> mHeight = height;
    }
    
    void setTitle(string title)
    {
        this -> mTitle = title;
    }
};
