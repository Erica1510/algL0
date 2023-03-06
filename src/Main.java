import java.nio.file.Path;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ReadFile.readTxtFile("/Users/ericadiaciuc/Desktop/алгоритмы и стр/lab0/Table.txt");
        VideoCardList myVideoCardsList = new VideoCardList();

        // Создание и добавление новых видеокарт
        Video_Cards vc1 = new Video_Cards(2,"GTX 1080", "Nvidia", 25, 600, 4567.8f);
        Video_Cards vc2 = new Video_Cards(4,"RX 5700 XT", "AMD", 76, 400,874.7f);
        myVideoCardsList.addVideoCard(vc1);
        myVideoCardsList.addVideoCard(vc2);



        // Вывод списка видеокарт
        ArrayList<Video_Cards> allVideoCards = myVideoCardsList.getVideoCards();
        for (Video_Cards vc : allVideoCards) {
            System.out.println(vc.getProduct_code() + " by " + vc.getEnergyConsum() + " with "
                    + vc.getTechnicalProcess() + " technical process for " + vc.getPrice() + "$");
        }
        // Удаление видеокарты
        System.out.println(vc1+ "\n "+ vc2);
        myVideoCardsList.removeVideoCard(vc1);
        System.out.println(vc1+ "\n "+ vc2);

        ReadFile.serialize(allVideoCards, Path.of("/Users/ericadiaciuc/Desktop/алгоритмы и стр/lab0/Table1.txt"));
    }

}

