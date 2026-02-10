import { test, expect } from '@playwright/test';

test('DELETE user', async ({ request }) => {
  const response = await request.delete(
    'https://reqres.in/api/users/2',{
        headers: {
      "X-api-key": "reqres_5282e5b946f94eb59c0aa3df95ad459e",
    }
    }
  );

  expect(response.status()).toBe(204);
});
