#ifndef GAMESTATEMNGR
#define GAMESTATEMNGR

#include <iostream>
#include <map>

#include "AbstractGameState.hpp"
#include "../logger/Logger.hpp"

using namespace std;

class GameStateManager
{
	int mCurrentGameState = 0;
	map<int, AbstractGameState*> mIdToStates;

public:
	void AddGameStates();

	void UpdateCurrentGameState();

	void RenderCurrentGameState();

	int GetCurrentGameState()
	{
		return this->mCurrentGameState;
	}

	void SetCurrentGameState(int stateId)
	{
		this->mCurrentGameState = stateId;
	}
};

#endif