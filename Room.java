public class Room {
    private char[][] room;

    public Room(char[][] r) {
        room = r;
    }

    /* simple getters and setters */
    public char[][] getRoom() {
        return room;
    }

    public char getTile(int i, int j) {
        return room[i][j];
    }

    public void setTile(int i, int j, char newTile) {
        room[i][j] = newTile;
    }

    /* moving tiles */
    public void move(int i1, int j1, int i2, int j2) {
        final char FLOOR_TILE = '.'; // TODO: should this be somewhere else?
        setTile(i2, j2, getTile(i1,j1));
        setTile(i1, j1, FLOOR_TILE);
    }

    /* rendering room */
    public void render() {
        System.out.println(this);
    }

    public String toString() {
        String output = "";

        // generate i rows
        for (int i = 0; i < room.length; i++) {
            // generate j columns per row
            for (int j = 0; j < room[0].length; j++) { // TODO: could that 0 be i?
                output += room[i][j];
                output += " ";
            }
            output += "\n";
        }

        return output;
    }

    public static void main(String[] args) {
        char[][] r = {
                {'#','#','#','#','#'},
                {'#','.','.','.','#'},
                {'#','.','.','.','#'},
                {'#','.','.','.','#'},
                {'#','.','.','.','#'},
                {'#','#','#','#','#'}
        };

        Room room = new Room(r);

        System.out.println(room);
    }
}