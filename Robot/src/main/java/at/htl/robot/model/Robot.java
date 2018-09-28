package at.htl.robot.model;

public class Robot {

    private int x = 0;
    private int y = 0;
    private Direction direction  = Direction.SOUTH;

    //region Getter and Setter
    public int getX() {
        return this.x;
    }

     public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    //endregion

    public void stepForward() {
        switch (direction) {
            case NORTH:
                y -= 1;
                break;
            case SOUTH:
                y += 1;
                break;
            case EAST:
                x += 1;
                break;
            case WEST:
                x -= 1;
                break;
        }
    }

    public void rotateLeft() {
        switch (direction){
            case WEST:
                this.direction = Direction.SOUTH;
                break;
            case SOUTH:
                this.direction = Direction.EAST;
                break;
            case EAST:
                this.direction = Direction.NORTH;
                break;
            case NORTH:
                this.direction = Direction.WEST;
                break;
        }

        /*switch(Direction.values(){
            case Direction.values()[0]:
               return Direction.values()[0 + 1];
        }*/

    }
}
