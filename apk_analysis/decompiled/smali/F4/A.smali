.class public final LF4/A;
.super LT4/d;
.source "SourceFile"


# instance fields
.field public final synthetic a:LF4/e;


# direct methods
.method public constructor <init>(LF4/e;Landroid/os/Looper;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF4/A;->a:LF4/e;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p2, p1}, LT4/d;-><init>(Landroid/os/Looper;I)V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 9

    .line 1
    iget-object v0, p0, LF4/A;->a:LF4/e;

    .line 2
    .line 3
    iget-object v0, v0, LF4/e;->x:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p1, Landroid/os/Message;->arg1:I

    .line 10
    .line 11
    const/4 v2, 0x7

    .line 12
    const/4 v3, 0x2

    .line 13
    const/4 v4, 0x1

    .line 14
    if-eq v0, v1, :cond_2

    .line 15
    .line 16
    iget v0, p1, Landroid/os/Message;->what:I

    .line 17
    .line 18
    if-eq v0, v3, :cond_1

    .line 19
    .line 20
    if-eq v0, v4, :cond_1

    .line 21
    .line 22
    if-ne v0, v2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void

    .line 26
    :cond_1
    :goto_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, LF4/s;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, LF4/s;->d()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    .line 38
    .line 39
    const/4 v1, 0x4

    .line 40
    const/4 v5, 0x5

    .line 41
    if-eq v0, v4, :cond_4

    .line 42
    .line 43
    if-eq v0, v2, :cond_4

    .line 44
    .line 45
    if-ne v0, v1, :cond_3

    .line 46
    .line 47
    iget-object v0, p0, LF4/A;->a:LF4/e;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    if-ne v0, v5, :cond_5

    .line 54
    .line 55
    :cond_4
    :goto_1
    iget-object v0, p0, LF4/A;->a:LF4/e;

    .line 56
    .line 57
    invoke-virtual {v0}, LF4/e;->g()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_1a

    .line 62
    .line 63
    :cond_5
    iget v0, p1, Landroid/os/Message;->what:I

    .line 64
    .line 65
    const/16 v6, 0x8

    .line 66
    .line 67
    const/4 v7, 0x0

    .line 68
    const/4 v8, 0x3

    .line 69
    if-ne v0, v1, :cond_b

    .line 70
    .line 71
    iget-object v0, p0, LF4/A;->a:LF4/e;

    .line 72
    .line 73
    new-instance v1, LB4/b;

    .line 74
    .line 75
    iget p1, p1, Landroid/os/Message;->arg2:I

    .line 76
    .line 77
    invoke-direct {v1, p1}, LB4/b;-><init>(I)V

    .line 78
    .line 79
    .line 80
    iput-object v1, v0, LF4/e;->u:LB4/b;

    .line 81
    .line 82
    iget-boolean p1, v0, LF4/e;->v:Z

    .line 83
    .line 84
    if-eqz p1, :cond_6

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_6
    invoke-virtual {v0}, LF4/e;->v()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-eqz p1, :cond_7

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_7
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-eqz p1, :cond_8

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_8
    :try_start_0
    invoke-virtual {v0}, LF4/e;->v()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    .line 111
    .line 112
    iget-object p1, p0, LF4/A;->a:LF4/e;

    .line 113
    .line 114
    iget-boolean v0, p1, LF4/e;->v:Z

    .line 115
    .line 116
    if-eqz v0, :cond_9

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_9
    invoke-virtual {p1, v8, v7}, LF4/e;->D(ILandroid/os/IInterface;)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :catch_0
    :goto_2
    iget-object p1, p0, LF4/A;->a:LF4/e;

    .line 124
    .line 125
    iget-object v0, p1, LF4/e;->u:LB4/b;

    .line 126
    .line 127
    if-eqz v0, :cond_a

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_a
    new-instance v0, LB4/b;

    .line 131
    .line 132
    invoke-direct {v0, v6}, LB4/b;-><init>(I)V

    .line 133
    .line 134
    .line 135
    :goto_3
    iget-object p1, p1, LF4/e;->k:LF4/d;

    .line 136
    .line 137
    invoke-interface {p1, v0}, LF4/d;->a(LB4/b;)V

    .line 138
    .line 139
    .line 140
    iget-object p1, p0, LF4/A;->a:LF4/e;

    .line 141
    .line 142
    invoke-virtual {p1, v0}, LF4/e;->y(LB4/b;)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :cond_b
    if-ne v0, v5, :cond_d

    .line 147
    .line 148
    iget-object p1, p0, LF4/A;->a:LF4/e;

    .line 149
    .line 150
    iget-object v0, p1, LF4/e;->u:LB4/b;

    .line 151
    .line 152
    if-eqz v0, :cond_c

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_c
    new-instance v0, LB4/b;

    .line 156
    .line 157
    invoke-direct {v0, v6}, LB4/b;-><init>(I)V

    .line 158
    .line 159
    .line 160
    :goto_4
    iget-object p1, p1, LF4/e;->k:LF4/d;

    .line 161
    .line 162
    invoke-interface {p1, v0}, LF4/d;->a(LB4/b;)V

    .line 163
    .line 164
    .line 165
    iget-object p1, p0, LF4/A;->a:LF4/e;

    .line 166
    .line 167
    invoke-virtual {p1, v0}, LF4/e;->y(LB4/b;)V

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :cond_d
    if-ne v0, v8, :cond_f

    .line 172
    .line 173
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 174
    .line 175
    instance-of v1, v0, Landroid/app/PendingIntent;

    .line 176
    .line 177
    if-eqz v1, :cond_e

    .line 178
    .line 179
    move-object v7, v0

    .line 180
    check-cast v7, Landroid/app/PendingIntent;

    .line 181
    .line 182
    :cond_e
    new-instance v0, LB4/b;

    .line 183
    .line 184
    iget p1, p1, Landroid/os/Message;->arg2:I

    .line 185
    .line 186
    invoke-direct {v0, p1, v7}, LB4/b;-><init>(ILandroid/app/PendingIntent;)V

    .line 187
    .line 188
    .line 189
    iget-object p1, p0, LF4/A;->a:LF4/e;

    .line 190
    .line 191
    iget-object p1, p1, LF4/e;->k:LF4/d;

    .line 192
    .line 193
    invoke-interface {p1, v0}, LF4/d;->a(LB4/b;)V

    .line 194
    .line 195
    .line 196
    iget-object p1, p0, LF4/A;->a:LF4/e;

    .line 197
    .line 198
    invoke-virtual {p1, v0}, LF4/e;->y(LB4/b;)V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :cond_f
    const/4 v1, 0x6

    .line 203
    if-ne v0, v1, :cond_11

    .line 204
    .line 205
    iget-object v0, p0, LF4/A;->a:LF4/e;

    .line 206
    .line 207
    invoke-virtual {v0, v5, v7}, LF4/e;->D(ILandroid/os/IInterface;)V

    .line 208
    .line 209
    .line 210
    iget-object v0, p0, LF4/A;->a:LF4/e;

    .line 211
    .line 212
    iget-object v0, v0, LF4/e;->p:LF4/b;

    .line 213
    .line 214
    if-eqz v0, :cond_10

    .line 215
    .line 216
    iget p1, p1, Landroid/os/Message;->arg2:I

    .line 217
    .line 218
    invoke-interface {v0, p1}, LF4/b;->g(I)V

    .line 219
    .line 220
    .line 221
    :cond_10
    iget-object p1, p0, LF4/A;->a:LF4/e;

    .line 222
    .line 223
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 227
    .line 228
    .line 229
    iget-object p1, p0, LF4/A;->a:LF4/e;

    .line 230
    .line 231
    invoke-static {p1, v5, v4, v7}, LF4/e;->C(LF4/e;IILandroid/os/IInterface;)Z

    .line 232
    .line 233
    .line 234
    return-void

    .line 235
    :cond_11
    if-ne v0, v3, :cond_13

    .line 236
    .line 237
    iget-object v0, p0, LF4/A;->a:LF4/e;

    .line 238
    .line 239
    invoke-virtual {v0}, LF4/e;->a()Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-eqz v0, :cond_12

    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_12
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast p1, LF4/s;

    .line 249
    .line 250
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-virtual {p1}, LF4/s;->d()V

    .line 254
    .line 255
    .line 256
    return-void

    .line 257
    :cond_13
    :goto_5
    iget v0, p1, Landroid/os/Message;->what:I

    .line 258
    .line 259
    if-eq v0, v3, :cond_15

    .line 260
    .line 261
    if-eq v0, v4, :cond_15

    .line 262
    .line 263
    if-ne v0, v2, :cond_14

    .line 264
    .line 265
    goto :goto_6

    .line 266
    :cond_14
    const-string p1, "Don\'t know how to handle message: "

    .line 267
    .line 268
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/k1;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    new-instance v0, Ljava/lang/Exception;

    .line 273
    .line 274
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 275
    .line 276
    .line 277
    const-string v1, "GmsClient"

    .line 278
    .line 279
    invoke-static {v1, p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 280
    .line 281
    .line 282
    return-void

    .line 283
    :cond_15
    :goto_6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 284
    .line 285
    move-object v0, p1

    .line 286
    check-cast v0, LF4/s;

    .line 287
    .line 288
    const-string p1, "Callback proxy "

    .line 289
    .line 290
    monitor-enter v0

    .line 291
    :try_start_1
    iget-object v1, v0, LF4/s;->a:Ljava/lang/Boolean;

    .line 292
    .line 293
    iget-boolean v2, v0, LF4/s;->b:Z

    .line 294
    .line 295
    if-eqz v2, :cond_16

    .line 296
    .line 297
    const-string v2, "GmsClient"

    .line 298
    .line 299
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v3

    .line 303
    new-instance v5, Ljava/lang/StringBuilder;

    .line 304
    .line 305
    invoke-direct {v5, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    const-string p1, " being reused. This is not safe."

    .line 312
    .line 313
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object p1

    .line 320
    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 321
    .line 322
    .line 323
    goto :goto_7

    .line 324
    :catchall_0
    move-exception p1

    .line 325
    goto :goto_9

    .line 326
    :cond_16
    :goto_7
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 327
    if-eqz v1, :cond_19

    .line 328
    .line 329
    iget-object p1, v0, LF4/s;->f:LF4/e;

    .line 330
    .line 331
    iget v1, v0, LF4/s;->d:I

    .line 332
    .line 333
    if-nez v1, :cond_17

    .line 334
    .line 335
    invoke-virtual {v0}, LF4/s;->b()Z

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    if-nez v1, :cond_19

    .line 340
    .line 341
    invoke-virtual {p1, v4, v7}, LF4/e;->D(ILandroid/os/IInterface;)V

    .line 342
    .line 343
    .line 344
    new-instance p1, LB4/b;

    .line 345
    .line 346
    invoke-direct {p1, v6, v7}, LB4/b;-><init>(ILandroid/app/PendingIntent;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0, p1}, LF4/s;->a(LB4/b;)V

    .line 350
    .line 351
    .line 352
    goto :goto_8

    .line 353
    :cond_17
    invoke-virtual {p1, v4, v7}, LF4/e;->D(ILandroid/os/IInterface;)V

    .line 354
    .line 355
    .line 356
    iget-object p1, v0, LF4/s;->e:Landroid/os/Bundle;

    .line 357
    .line 358
    if-eqz p1, :cond_18

    .line 359
    .line 360
    const-string v2, "pendingIntent"

    .line 361
    .line 362
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 363
    .line 364
    .line 365
    move-result-object p1

    .line 366
    move-object v7, p1

    .line 367
    check-cast v7, Landroid/app/PendingIntent;

    .line 368
    .line 369
    :cond_18
    new-instance p1, LB4/b;

    .line 370
    .line 371
    invoke-direct {p1, v1, v7}, LB4/b;-><init>(ILandroid/app/PendingIntent;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v0, p1}, LF4/s;->a(LB4/b;)V

    .line 375
    .line 376
    .line 377
    :cond_19
    :goto_8
    monitor-enter v0

    .line 378
    :try_start_2
    iput-boolean v4, v0, LF4/s;->b:Z

    .line 379
    .line 380
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 381
    invoke-virtual {v0}, LF4/s;->d()V

    .line 382
    .line 383
    .line 384
    return-void

    .line 385
    :catchall_1
    move-exception p1

    .line 386
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 387
    throw p1

    .line 388
    :goto_9
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 389
    throw p1

    .line 390
    :cond_1a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 391
    .line 392
    check-cast p1, LF4/s;

    .line 393
    .line 394
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    invoke-virtual {p1}, LF4/s;->d()V

    .line 398
    .line 399
    .line 400
    return-void
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
.end method
