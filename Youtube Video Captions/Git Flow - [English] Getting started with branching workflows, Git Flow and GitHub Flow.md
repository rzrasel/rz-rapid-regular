Getting started with branching workflows, Git Flow and GitHub Flow
Link: https://youtu.be/gW6dFpTMk8s

gW6dFpTMk8s
-- 00:00 -- কেমন আছো সবাই, আমি নিক, আজকে আমরা গিট ব্রাঞ্চিং (ব্র্যাঞ্চিং) ওয়ার্কফ্লো নিয়ে কথা বলবো। গিট ব্রাঞ্চিংকে - ব্রাঞ্চিং (ব্র্যাঞ্চিং) মডেল বা গিট ব্রাঞ্চিং (ব্র্যাঞ্চিং) ফ্লোও বলে। গিট ফ্লো'র ধারণা এসেছে মূলত, একটি কোড বেসে একাধিক প্রোগ্রামার কাজ করতে পারবে। কোড বেজ ম্যানেজ করতে পারবে, একাধিক ডেভেলপার কোন কনফ্লিক্ট ছাড়াই এক বা একাধিক আলাদা আলাদা ফিচার নিয়ে কাজ করতে পারবে।

-- 00:52 -- তাহলে আসুন গিট ফ্লো শুরু করা যাক। একজন ডেভেলপার যখন কোনো গিটফ্লো ব্যাবহার না করে, গিটে কোন সফটওয়ার ডেভেলপ করে, তখন কিছু কোড লিখে গিটের মেইন ব্রাঞ্চে কমিট করি। আবার কিছু কোড লিখে গিটের মেইন ব্রাঞ্চে কমিট করি। একটা পর্যায়ে পোস্ট প্রোডাকশন দেয়া হয়। পোস্ট প্রডাকশনে কোন সমস্যা থাকলে তা সমাধান করে প্রডাকশনে দেয়া হয়। একজন মাত্র ডেভেলপার কাজ করলে এই পদ্ধতিতে কাজ করলে কোন সমস্যা হয় না।

-- 01:18 -- কিন্তু একই কোডবেজে একাধিক ডেভেলোপার কাজ করলে এই প্রসেসে কাজ করা সম্ভব হবে না, বা কঠিন হয়। কারণ কোন কোন পয়েন্টে আমার কমিট বা রিলিজ যাচ্ছে আর কোন কোন পয়েন্টে অন্যদের কমিট বা রিলিজ যাচ্ছে তা ট্রেস রাখা খুবই কঠিন। আর এই কারণেই গিটফ্লো। আর এই কারণেই গিটফ্লো। গিটফ্লো একটা নিদৃষ্ট স্ট্রাকচার ফলো করে।

-- 01:40 -- 