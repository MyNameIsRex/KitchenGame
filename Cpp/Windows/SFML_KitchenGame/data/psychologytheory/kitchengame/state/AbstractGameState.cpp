#include "AbstractGameState.hpp"

AbstractGameState::AbstractGameState(int stateId, string name)
{
	this->mStateId = stateId;
	this->mName = name;
}