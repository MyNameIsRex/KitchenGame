#include "GameStateManager.hpp"

void GameStateManager::AddGameStates()
{
	Logger::LogInfo("Adding game states");

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

	Logger::LogInfo("Game states updated!");
}

void GameStateManager::RenderCurrentGameState()
{
	if (this->mIdToStates.empty())
	{
		Logger::LogWarning("Empty game state map! Skipping Rendering");
		return;
	}

	Logger::LogInfo("Game states rendered!");
}