package data.psychologytheory.kitchengame.gameplay.characters.goals.movetotarget;

import data.psychologytheory.kitchengame.gameplay.characters.AbstractCharacter;
import data.psychologytheory.kitchengame.gameplay.characters.goals.AbstractCharacterGoals;
import data.psychologytheory.kitchengame.gameplay.gameobjects.AbstractGameObject;
import data.psychologytheory.kitchengame.gameplay.init.GameObjectInit;

public class MoveToTargetGoal extends AbstractCharacterGoals {
    private AbstractGameObject target;

    //FACING: 0 -> Down, 1 -> Up, 2 -> Left, 3 -> Right
    private static int FACING = 0;
    private float characterPosX, characterPosY;
    private float characterWidth, characterHeight;
    private float targetPosX, targetPosY;
    private float targetWidth, targetHeight;
    private float currentWallX, currentWallY;
    private float currentWallWidth, currentWallHeight;


    public MoveToTargetGoal(AbstractCharacter character, AbstractGameObject target) {
        super(character);
        this.characterPosX = character.getObjPosX();
        this.characterPosY = character.getObjPosY();
        this.characterWidth = character.getObjWidth();
        this.characterHeight = character.getObjHeight();
        this.targetPosX = target.getObjPosX();
        this.targetPosY = target.getObjPosY();
        this.targetWidth = target.getObjWidth();
        this.targetHeight = target.getObjHeight();
        this.currentWallX = 0;
        this.currentWallY = 0;
    }

    @Override
    public void executeGoal() {
        this.determineWallObject(FACING);
        if (isWallInFront(this.characterPosX, this.characterPosY, this.characterWidth, this.characterHeight, this.currentWallX, this.currentWallY)) {

        }
    }

    @Override
    public boolean isGoalSuccessful() {
        return false;
    }

    private boolean isWallInFront(float characterX, float characterY, float characterWidth, float characterHeight, float wallX, float wallY) {
        return (characterX + characterWidth) == (wallX - 64) ||
                (characterX) == (wallX + 64) ||
                (characterY) == (wallY + 64) ||
                        (characterY + characterHeight) == (wallY - 64);
    }

    private boolean hasReachedTargetFromHorizontal(float characterX, float characterWidth, float targetX, float targetWidth) {
        return (characterX + characterWidth) == (targetX - 64) &&
                (characterX) == (targetX + targetWidth + 64);
    }

    private boolean hasReachedTargetFromVertical(float characterY, float characterHeight, float targetY, float targetHeight) {
        return (characterY) == (targetY + targetHeight + 64) &&
                (characterY + characterHeight) == (targetY - 64);
    }

    private void determineWallObject(int facing) {
        GameObjectInit.GAME_OBJECT_MAP.forEach((integer, gameObject) -> {
            switch (facing) {
                case 0:
                    currentWallY = (gameObject.getObjPosY() + gameObject.getObjHeight());
                    break;
                case 1:
                    currentWallY = (gameObject.getObjPosY());
                case 2:
                    currentWallX = (gameObject.getObjPosX() + gameObject.getObjWidth());
                    break;
                case 3:
                    currentWallX = (gameObject.getObjPosX());
                    break;
                default:
                    currentWallX = 0;
                    currentWallY = 0;
                    break;
            }
        });
    }
}
