#include <iostream>
using namespace std;
/* author :: @mirroris */
/**
* If you compile this file,perhaps you see this errors below;
* So, you need to use static;
* Singleton.cpp:6:15: error: field 's' has incomplete type 'Singleton'
*       6 |     Singleton s;
*       |               ^
*   Singleton.cpp:4:7: note: definition of 'class Singleton' is not complete until t
*   he closing brace
*       4 | class Singleton {
*       |       ^~~~~~~~~
 */

/**
    class Singleton {
        private:
        Singleton s;
        public:
        Singleton(){
            cout << "I am a Singleton!" << endl;
        }
    };

    int main(char args, char *argv[]){
        Singleton *s = new Singleton();
        delete s; 
    }
*/

class Singleton {
    private:
    static Singleton s;
    public:
    Singleton(){
        cout << "I am a Singleton!" << endl;
    }
};

int main(char args, char *argv[]){
    Singleton *s = new Singleton();
    delete s; 
}