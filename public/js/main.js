const submitBtn = document.getElementById('submitBtn');
const city_Name = document.getElementById('city_name');
const temp=document.getElementById('temp');
const temp_status=document.getElementById('temp_status');
const icon=document.getElementById('weather-icon');
const datahide=document.querySelector('.middle_layer');
const getInfo = async (event) => {
    event.preventDefault();
    let cityVal = cityName.value;
    if (cityVal === "") {
        city_Name.innerText = `Pls write the name before search`;
        datahide.classList.add('datahide');
        
    }

    else {
        try{
            let url = `https://api.openweathermap.org/data/2.5/weather?q=${cityVal}&units=metric&appid=247c04c33707be4e2a5bd3a6a0090a16`
            const response = await fetch(url)
            const data=await response.json();

            const arrData=[data];
            temp.innerText=arrData[0].main.temp.toFixed(0);
            city_Name.innerText=`${arrData[0].name},${arrData[0].sys.country}`;
            temp_status.innerText=arrData[0].weather[0].main;
            // condition to check sunny or cloudy
            datahide.classList.remove('datahide');

            const tempMood=arrData[0].weather[0].main;
            if(tempMood=="Clear"){
                temp_status.innerHTML="<i class='fa fa-sun',style='color:#eccc68;'></i>";
            }else if(tempMood=="clouds"){
                temp_status.innerHTML="<i class='fas fa-cloud',style='color:#f1f2f6;'></i>";
            }
            else if(tempMood=="Rain"){
                temp_status.innerHTML="<i class='fas fa-rain',style='color:#a4b0be;'></i>";
            }
            else {
                temp_status.innerHTML="<i class='fa fa-sun',style='color:#eccc68;'></i>";
            }
        }
        catch{
            city_Name.innerText = `Pls write the name properly`;
            datahide.classList.add('datahide');

        }
    }

}
submitBtn.addEventListener('click', getInfo);
