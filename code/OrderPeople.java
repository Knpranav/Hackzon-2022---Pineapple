public class OrderPeople {
    public double distance(double lat1, double lat2, double lon1, double lon2) {

        final int R = 6371; // Radius of the earth

        double latDistance = Math.toRadians(lat2 - lat1);
        double lonDistance = Math.toRadians(lon2 - lon1);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c * 1000;

        distance = Math.pow(distance, 2);

        return Math.sqrt(distance);
    }

    public People sortOrder(People people){
        double startX = 12.933724090887674, startY = 77.69165935712232;
        People visitedPeople = new People();
        Person personToAdd = new Person();
        while(visitedPeople.size() != people.size()){
            double minDist = 9999999;
            for(Person person : people){
                if(!visitedPeople.contains(person)){
                    if(distance(startX, (double)person.x, startY, (double)person.y) < minDist){
                        minDist = distance(startX, (double)person.x, startY, (double)person.y);
                        startX = person.x;
                        startY = person.y;
                        personToAdd = person;
                    }
                }
            }
            visitedPeople.add(personToAdd);
        }
        return visitedPeople;
    }

}
