#include "Game.hpp"

Game::Game(int width, int height, std::string title)
{
	this->width = width;
	this->height = height;
	this->title = title;
	this->Initialize();
}

void Game::Initialize()
{
	this->window.create(sf::VideoMode(this->width, this->height), this->title);
	
	this->shape.setRadius(100.0F);
	this->shape.setFillColor(sf::Color::Green);
}

void Game::Run()
{
	while (this->window.isOpen())
	{
		this->Update(this->event);
		this->Render();
	}
}

void Game::Update(sf::Event event)
{
	while (window.pollEvent(event))
	{
		if (event.type == sf::Event::Closed || (event.type == sf::Event::KeyPressed && sf::Keyboard::isKeyPressed(sf::Keyboard::Escape)))
		{
			this->window.close();
		}
		
		if (event.type == sf::Event::KeyPressed && sf::Keyboard::isKeyPressed(sf::Keyboard::F))
		{
			this->shape.setPosition(120, 300);
		}
	}
}

void Game::Render()
{
	this->window.clear();
	this->window.draw(this->shape);
	this->window.display();
}