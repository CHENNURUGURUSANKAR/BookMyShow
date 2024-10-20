 requirements 
        multiple city
        multiple theatre 
        multiple halls
        seat type
            gold
            diamond
        every hall
            2d
            3d
            4d
            i max
            dolby 
        multiple shows
        search
            movie
            theatre
            city
            language
            rating
            Genre 
        list of available seats
        coupon codes
        calculate price:
            price(seatType)
            Price(Theatre)
            Price(day)
            Price(movie)
            Price(Time)
        cancel seat 
            before one-hour movie start
 Use case Diagram 
    user 
        book ticket 
            pay ->
                upi 
                netBanking 
            <--check available
        cancel ticket
        search movie ->
            movie
            theatre
            time
    Admin
        CRUD 
            movie
            theatre
            screen
 --------------------------------------------------------------------------------------
API design 
    Admin
        create post
            city
            movie
        put/patch update  
            movie
        create 
            Theatre
        delete 
            movie
        delete
            theatre
        
            
    
 
            
 
    
 
 