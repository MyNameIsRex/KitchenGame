//
//  GameStateManager.hpp
//  SFML KitchenGame
//
//  Created by Rex Huang on 2024/1/29.
//  Copyright © 2024 PsychologyTheory. All rights reserved.
//

#ifndef GAMESTATEMNGR
#define GAMESTATEMNGR

#include <iostream>
#include <map>
#include "../logger/Logger.hpp"
#include "AbstractGameState.hpp"

class GameStateManager
{
    int mCurrentGameState = 0;
    map<int, AbstractGameState*> mIdToStates;
    
public:
    void AddGameStates();
    
    void UpdateCurrentGameState();
    
    void RenderCurrentGameState();
    
    int GetCurrentState()
    {
        return this->mCurrentGameState;
    }
    
    void SetCurrentState(int stateId)
    {
        this->mCurrentGameState = stateId;
    }
};

#endif
