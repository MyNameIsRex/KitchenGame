//
//  GameStateManager.cpp
//  SFML KitchenGame
//
//  Created by Rex Huang on 2024/1/29.
//  Copyright © 2024 PsychologyTheory. All rights reserved.
//

#include "GameStateManager.hpp"
#include "../logger/Logger.hpp"

void GameStateManager::AddGameStates()
{
    Logger::LogInfo("Adding games states");
    
    //Add game states here
    
    Logger::LogInfo("Game states added!");
}

void GameStateManager::UpdateCurrentGameState()
{
    if (this->mIdToStates.empty())
    {
        Logger::LogWarning("Empty game state map! Skipping Updates");
        return;
    }
}

void GameStateManager::RenderCurrentGameState()
{
    if (this->mIdToStates.empty())
    {
        Logger::LogWarning("Empty game state map! Skipping Rendering");
        return;
    }
}
