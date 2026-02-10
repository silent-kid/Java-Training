import { test, expect } from "@playwright/test";

test("GET", async ({ request }) => {
  const response = await request.get(
    "https://reqres.in/api/users/2",
    {
      headers: {
        "X-api-key": "reqres_5282e5b946f94eb59c0aa3df95ad459e"
      }
    }
  );

  expect(response.status()).toBe(200);

  const body = await response.json();
  const text = await response.text();
  expect(text).toContain("janet");
  expect(body.data.id).toBe(2);
  console.log(body);
});
