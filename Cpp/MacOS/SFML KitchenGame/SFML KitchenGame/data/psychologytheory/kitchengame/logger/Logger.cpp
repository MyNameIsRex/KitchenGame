//
//  Logger.cpp
//  SFML KitchenGame
//
//  Created by Rex Huang on 2024/1/28.
//  Copyright © 2024 PsychologyTheory. All rights reserved.
//

#include "Logger.hpp"

void Logger::LogInfo(string message)
{
    cout << "[Info] " << message << endl;
}

void Logger::LogWarning(string message)
{
    cout << "[Warning] " << message << endl;
}

void Logger::LogError(string message)
{
    cout << "[Error] " << message << endl;
}
