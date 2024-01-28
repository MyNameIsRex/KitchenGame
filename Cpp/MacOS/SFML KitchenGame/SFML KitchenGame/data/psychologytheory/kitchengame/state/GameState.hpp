//
//  GameState.hpp
//  SFML KitchenGame
//
//  Created by Rex Huang on 2024/1/28.
//  Copyright © 2024 PsychologyTheory. All rights reserved.
//

#ifndef GameState_hpp
#define GameState_hpp

#include <iostream>
#include "AbstractGameState.hpp"

#endif /* GameState_hpp */

using namespace std;

class GameState : AbstractGameState
{
public:
    GameState(const char* name);
    
    ~GameState();
    
    void InitializeGameState() override;
    
    void UpdateGameState() override;
    
    void RenderGameState() override;
};
