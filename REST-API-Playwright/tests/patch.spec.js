import {test, expect} from '@playwright/test'

test('PATCH', async ({request})=> {
    const response = await request.patch('https://reqres.in/api/users/2',({
        headers: {
      "X-api-key": "reqres_5282e5b946f94eb59c0aa3df95ad459e",
    },
    data: {
      name: "Jawwad",
      job: "Senior Developer",
    }
    }))
    expect(response.status()).toBe(200);

    const body = await response.json();
    console.log(body);


    expect(body.job).toContain("Senior Developer");
})