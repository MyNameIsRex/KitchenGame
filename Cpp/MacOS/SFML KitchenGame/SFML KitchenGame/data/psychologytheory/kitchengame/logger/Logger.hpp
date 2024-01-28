//
//  Logger.hpp
//  SFML KitchenGame
//
//  Created by Rex Huang on 2024/1/28.
//  Copyright © 2024 PsychologyTheory. All rights reserved.
//

#ifndef Logger_hpp
#define Logger_hpp

#include <iostream>

#endif /* Logger_hpp */

using namespace std;

class Logger
{
public:
    void LogInfo(const char* message);
    
    void LogWarning(const char* message);
    
    void LogError(const char* message);
};
