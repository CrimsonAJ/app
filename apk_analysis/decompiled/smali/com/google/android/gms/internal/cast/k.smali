.class public abstract Lcom/google/android/gms/internal/cast/k;
.super LS4/c;
.source "SourceFile"


# instance fields
.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/google/android/gms/internal/cast/k;->f:I

    const/4 p2, 0x2

    invoke-direct {p0, p1, p2}, LS4/c;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final g1(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 10

    .line 1
    const v0, 0xbdfcb8

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x3

    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x4

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    iget v6, p0, Lcom/google/android/gms/internal/cast/k;->f:I

    .line 10
    .line 11
    packed-switch v6, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    if-eq p1, v5, :cond_8

    .line 15
    .line 16
    if-eq p1, v2, :cond_6

    .line 17
    .line 18
    if-eq p1, v1, :cond_1

    .line 19
    .line 20
    if-eq p1, v3, :cond_0

    .line 21
    .line 22
    goto/16 :goto_3

    .line 23
    .line 24
    :cond_0
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 28
    .line 29
    .line 30
    :goto_0
    move v4, v5

    .line 31
    goto/16 :goto_3

    .line 32
    .line 33
    :cond_1
    move-object p1, p0

    .line 34
    check-cast p1, Lcom/google/android/gms/internal/cast/g;

    .line 35
    .line 36
    new-array p2, v4, [Ljava/lang/Object;

    .line 37
    .line 38
    sget-object v0, Lcom/google/android/gms/internal/cast/g;->i:Ly4/b;

    .line 39
    .line 40
    iget-object v1, v0, Ly4/b;->a:Ljava/lang/String;

    .line 41
    .line 42
    const-string v6, "onAppEnteredBackground"

    .line 43
    .line 44
    invoke-virtual {v0, v6, p2}, Ly4/b;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-static {v1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    iput v2, p1, Lcom/google/android/gms/internal/cast/g;->h:I

    .line 52
    .line 53
    iget-object p1, p1, Lcom/google/android/gms/internal/cast/g;->g:Ljava/util/Set;

    .line 54
    .line 55
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    if-eqz p2, :cond_5

    .line 64
    .line 65
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    check-cast p2, Lcom/google/android/gms/internal/cast/p;

    .line 70
    .line 71
    iget-object p2, p2, Lcom/google/android/gms/internal/cast/p;->a:Lcom/google/android/gms/internal/cast/q;

    .line 72
    .line 73
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    new-array v0, v4, [Ljava/lang/Object;

    .line 77
    .line 78
    sget-object v1, Lcom/google/android/gms/internal/cast/q;->f:Ly4/b;

    .line 79
    .line 80
    const-string v2, "Stopping RouteDiscovery."

    .line 81
    .line 82
    invoke-virtual {v1, v2, v0}, Ly4/b;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p2, Lcom/google/android/gms/internal/cast/q;->c:Ljava/util/Map;

    .line 86
    .line 87
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 88
    .line 89
    .line 90
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    if-ne v0, v1, :cond_4

    .line 99
    .line 100
    iget-object v0, p2, Lcom/google/android/gms/internal/cast/q;->e:Lcom/google/android/gms/internal/cast/u;

    .line 101
    .line 102
    iget-object v1, v0, Lcom/google/android/gms/internal/cast/u;->b:Lt0/D;

    .line 103
    .line 104
    if-nez v1, :cond_3

    .line 105
    .line 106
    iget-object v1, v0, Lcom/google/android/gms/internal/cast/u;->a:Landroid/content/Context;

    .line 107
    .line 108
    invoke-static {v1}, Lt0/D;->d(Landroid/content/Context;)Lt0/D;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    iput-object v1, v0, Lcom/google/android/gms/internal/cast/u;->b:Lt0/D;

    .line 113
    .line 114
    :cond_3
    iget-object v0, v0, Lcom/google/android/gms/internal/cast/u;->b:Lt0/D;

    .line 115
    .line 116
    if-eqz v0, :cond_2

    .line 117
    .line 118
    invoke-virtual {v0, p2}, Lt0/D;->h(Lt0/x;)V

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_4
    new-instance v0, LT4/d;

    .line 123
    .line 124
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-direct {v0, v1, v3}, LT4/d;-><init>(Landroid/os/Looper;I)V

    .line 129
    .line 130
    .line 131
    new-instance v1, Lcom/google/android/gms/internal/cast/n;

    .line 132
    .line 133
    invoke-direct {v1, p2, v4}, Lcom/google/android/gms/internal/cast/n;-><init>(Lcom/google/android/gms/internal/cast/q;I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_5
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 141
    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_6
    move-object p1, p0

    .line 145
    check-cast p1, Lcom/google/android/gms/internal/cast/g;

    .line 146
    .line 147
    new-array p2, v4, [Ljava/lang/Object;

    .line 148
    .line 149
    sget-object v0, Lcom/google/android/gms/internal/cast/g;->i:Ly4/b;

    .line 150
    .line 151
    iget-object v1, v0, Ly4/b;->a:Ljava/lang/String;

    .line 152
    .line 153
    const-string v2, "onAppEnteredForeground"

    .line 154
    .line 155
    invoke-virtual {v0, v2, p2}, Ly4/b;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    invoke-static {v1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 160
    .line 161
    .line 162
    iput v5, p1, Lcom/google/android/gms/internal/cast/g;->h:I

    .line 163
    .line 164
    iget-object p1, p1, Lcom/google/android/gms/internal/cast/g;->g:Ljava/util/Set;

    .line 165
    .line 166
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result p2

    .line 174
    if-eqz p2, :cond_7

    .line 175
    .line 176
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    check-cast p2, Lcom/google/android/gms/internal/cast/p;

    .line 181
    .line 182
    iget-object p2, p2, Lcom/google/android/gms/internal/cast/p;->a:Lcom/google/android/gms/internal/cast/q;

    .line 183
    .line 184
    invoke-virtual {p2}, Lcom/google/android/gms/internal/cast/q;->o()V

    .line 185
    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_7
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 189
    .line 190
    .line 191
    goto/16 :goto_0

    .line 192
    .line 193
    :cond_8
    move-object p1, p0

    .line 194
    check-cast p1, Lcom/google/android/gms/internal/cast/g;

    .line 195
    .line 196
    new-instance p2, LN4/b;

    .line 197
    .line 198
    invoke-direct {p2, p1}, LN4/b;-><init>(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 202
    .line 203
    .line 204
    invoke-static {p3, p2}, Lcom/google/android/gms/internal/cast/C;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 205
    .line 206
    .line 207
    goto/16 :goto_0

    .line 208
    .line 209
    :goto_3
    return v4

    .line 210
    :pswitch_0
    const-string v6, "There is no default route.  The media router has not yet been fully initialized."

    .line 211
    .line 212
    const/4 v7, 0x0

    .line 213
    packed-switch p1, :pswitch_data_1

    .line 214
    .line 215
    .line 216
    goto/16 :goto_f

    .line 217
    .line 218
    :pswitch_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 219
    .line 220
    .line 221
    move-result p1

    .line 222
    invoke-static {p2}, Lcom/google/android/gms/internal/cast/C;->b(Landroid/os/Parcel;)V

    .line 223
    .line 224
    .line 225
    move-object p2, p0

    .line 226
    check-cast p2, Lcom/google/android/gms/internal/cast/t;

    .line 227
    .line 228
    iget-object p2, p2, Lcom/google/android/gms/internal/cast/t;->g:Lt0/D;

    .line 229
    .line 230
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    invoke-static {p1}, Lt0/D;->i(I)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 237
    .line 238
    .line 239
    :goto_4
    move v4, v5

    .line 240
    goto/16 :goto_f

    .line 241
    .line 242
    :pswitch_2
    move-object p1, p0

    .line 243
    check-cast p1, Lcom/google/android/gms/internal/cast/t;

    .line 244
    .line 245
    iget-object p1, p1, Lcom/google/android/gms/internal/cast/t;->g:Lt0/D;

    .line 246
    .line 247
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    invoke-static {}, Lt0/D;->b()V

    .line 251
    .line 252
    .line 253
    invoke-static {}, Lt0/D;->c()Lt0/e;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    iget-object p1, p1, Lt0/e;->w:Lt0/C;

    .line 258
    .line 259
    if-eqz p1, :cond_9

    .line 260
    .line 261
    invoke-static {}, Lt0/D;->f()Lt0/C;

    .line 262
    .line 263
    .line 264
    move-result-object p2

    .line 265
    iget-object p2, p2, Lt0/C;->c:Ljava/lang/String;

    .line 266
    .line 267
    iget-object p1, p1, Lt0/C;->c:Ljava/lang/String;

    .line 268
    .line 269
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result p1

    .line 273
    if-eqz p1, :cond_9

    .line 274
    .line 275
    move v4, v5

    .line 276
    :cond_9
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 277
    .line 278
    .line 279
    sget p1, Lcom/google/android/gms/internal/cast/C;->a:I

    .line 280
    .line 281
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 282
    .line 283
    .line 284
    goto :goto_4

    .line 285
    :pswitch_3
    move-object p1, p0

    .line 286
    check-cast p1, Lcom/google/android/gms/internal/cast/t;

    .line 287
    .line 288
    iget-object p2, p1, Lcom/google/android/gms/internal/cast/t;->i:Ljava/util/HashMap;

    .line 289
    .line 290
    invoke-virtual {p2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    if-eqz v1, :cond_b

    .line 303
    .line 304
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    check-cast v1, Ljava/util/Set;

    .line 309
    .line 310
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 315
    .line 316
    .line 317
    move-result v2

    .line 318
    if-eqz v2, :cond_a

    .line 319
    .line 320
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    check-cast v2, Lt0/x;

    .line 325
    .line 326
    iget-object v3, p1, Lcom/google/android/gms/internal/cast/t;->g:Lt0/D;

    .line 327
    .line 328
    invoke-virtual {v3, v2}, Lt0/D;->h(Lt0/x;)V

    .line 329
    .line 330
    .line 331
    goto :goto_5

    .line 332
    :cond_b
    invoke-virtual {p2}, Ljava/util/HashMap;->clear()V

    .line 333
    .line 334
    .line 335
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 336
    .line 337
    .line 338
    goto :goto_4

    .line 339
    :pswitch_4
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 340
    .line 341
    .line 342
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 343
    .line 344
    .line 345
    goto :goto_4

    .line 346
    :pswitch_5
    move-object p1, p0

    .line 347
    check-cast p1, Lcom/google/android/gms/internal/cast/t;

    .line 348
    .line 349
    iget-object p1, p1, Lcom/google/android/gms/internal/cast/t;->g:Lt0/D;

    .line 350
    .line 351
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    invoke-static {}, Lt0/D;->f()Lt0/C;

    .line 355
    .line 356
    .line 357
    move-result-object p1

    .line 358
    iget-object p1, p1, Lt0/C;->c:Ljava/lang/String;

    .line 359
    .line 360
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 361
    .line 362
    .line 363
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    goto :goto_4

    .line 367
    :pswitch_6
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object p1

    .line 371
    invoke-static {p2}, Lcom/google/android/gms/internal/cast/C;->b(Landroid/os/Parcel;)V

    .line 372
    .line 373
    .line 374
    move-object p2, p0

    .line 375
    check-cast p2, Lcom/google/android/gms/internal/cast/t;

    .line 376
    .line 377
    iget-object p2, p2, Lcom/google/android/gms/internal/cast/t;->g:Lt0/D;

    .line 378
    .line 379
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    invoke-static {}, Lt0/D;->b()V

    .line 383
    .line 384
    .line 385
    invoke-static {}, Lt0/D;->c()Lt0/e;

    .line 386
    .line 387
    .line 388
    move-result-object p2

    .line 389
    iget-object p2, p2, Lt0/e;->i:Ljava/util/ArrayList;

    .line 390
    .line 391
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 392
    .line 393
    .line 394
    move-result v0

    .line 395
    move v1, v4

    .line 396
    :cond_c
    if-ge v1, v0, :cond_d

    .line 397
    .line 398
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    add-int/2addr v1, v5

    .line 403
    check-cast v2, Lt0/C;

    .line 404
    .line 405
    iget-object v3, v2, Lt0/C;->c:Ljava/lang/String;

    .line 406
    .line 407
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 408
    .line 409
    .line 410
    move-result v3

    .line 411
    if-eqz v3, :cond_c

    .line 412
    .line 413
    iget-object v7, v2, Lt0/C;->s:Landroid/os/Bundle;

    .line 414
    .line 415
    :cond_d
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 416
    .line 417
    .line 418
    if-nez v7, :cond_e

    .line 419
    .line 420
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 421
    .line 422
    .line 423
    goto/16 :goto_4

    .line 424
    .line 425
    :cond_e
    invoke-virtual {p3, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v7, p3, v5}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    .line 429
    .line 430
    .line 431
    goto/16 :goto_4

    .line 432
    .line 433
    :pswitch_7
    move-object p1, p0

    .line 434
    check-cast p1, Lcom/google/android/gms/internal/cast/t;

    .line 435
    .line 436
    iget-object p1, p1, Lcom/google/android/gms/internal/cast/t;->g:Lt0/D;

    .line 437
    .line 438
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    invoke-static {}, Lt0/D;->b()V

    .line 442
    .line 443
    .line 444
    invoke-static {}, Lt0/D;->c()Lt0/e;

    .line 445
    .line 446
    .line 447
    move-result-object p1

    .line 448
    iget-object p1, p1, Lt0/e;->v:Lt0/C;

    .line 449
    .line 450
    if-eqz p1, :cond_f

    .line 451
    .line 452
    invoke-static {}, Lt0/D;->f()Lt0/C;

    .line 453
    .line 454
    .line 455
    move-result-object p2

    .line 456
    iget-object p2, p2, Lt0/C;->c:Ljava/lang/String;

    .line 457
    .line 458
    iget-object p1, p1, Lt0/C;->c:Ljava/lang/String;

    .line 459
    .line 460
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result p1

    .line 464
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 465
    .line 466
    .line 467
    sget p2, Lcom/google/android/gms/internal/cast/C;->a:I

    .line 468
    .line 469
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 470
    .line 471
    .line 472
    goto/16 :goto_4

    .line 473
    .line 474
    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 475
    .line 476
    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    throw p1

    .line 480
    :pswitch_8
    move-object p1, p0

    .line 481
    check-cast p1, Lcom/google/android/gms/internal/cast/t;

    .line 482
    .line 483
    iget-object p1, p1, Lcom/google/android/gms/internal/cast/t;->g:Lt0/D;

    .line 484
    .line 485
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    invoke-static {}, Lt0/D;->b()V

    .line 489
    .line 490
    .line 491
    invoke-static {}, Lt0/D;->c()Lt0/e;

    .line 492
    .line 493
    .line 494
    move-result-object p1

    .line 495
    iget-object p1, p1, Lt0/e;->v:Lt0/C;

    .line 496
    .line 497
    if-eqz p1, :cond_10

    .line 498
    .line 499
    invoke-virtual {p1, v5}, Lt0/C;->l(Z)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 503
    .line 504
    .line 505
    goto/16 :goto_4

    .line 506
    .line 507
    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 508
    .line 509
    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 510
    .line 511
    .line 512
    throw p1

    .line 513
    :pswitch_9
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object p1

    .line 517
    invoke-static {p2}, Lcom/google/android/gms/internal/cast/C;->b(Landroid/os/Parcel;)V

    .line 518
    .line 519
    .line 520
    move-object p2, p0

    .line 521
    check-cast p2, Lcom/google/android/gms/internal/cast/t;

    .line 522
    .line 523
    new-array v0, v5, [Ljava/lang/Object;

    .line 524
    .line 525
    aput-object p1, v0, v4

    .line 526
    .line 527
    sget-object v1, Lcom/google/android/gms/internal/cast/t;->n:Ly4/b;

    .line 528
    .line 529
    const-string v2, "select route with routeId = %s"

    .line 530
    .line 531
    invoke-virtual {v1, v2, v0}, Ly4/b;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 532
    .line 533
    .line 534
    iget-object p2, p2, Lcom/google/android/gms/internal/cast/t;->g:Lt0/D;

    .line 535
    .line 536
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 537
    .line 538
    .line 539
    invoke-static {}, Lt0/D;->b()V

    .line 540
    .line 541
    .line 542
    invoke-static {}, Lt0/D;->c()Lt0/e;

    .line 543
    .line 544
    .line 545
    move-result-object p2

    .line 546
    iget-object p2, p2, Lt0/e;->i:Ljava/util/ArrayList;

    .line 547
    .line 548
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 549
    .line 550
    .line 551
    move-result v0

    .line 552
    move v2, v4

    .line 553
    :cond_11
    if-ge v2, v0, :cond_12

    .line 554
    .line 555
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v3

    .line 559
    add-int/2addr v2, v5

    .line 560
    check-cast v3, Lt0/C;

    .line 561
    .line 562
    iget-object v6, v3, Lt0/C;->c:Ljava/lang/String;

    .line 563
    .line 564
    invoke-virtual {v6, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    move-result v6

    .line 568
    if-eqz v6, :cond_11

    .line 569
    .line 570
    new-array p1, v4, [Ljava/lang/Object;

    .line 571
    .line 572
    const-string p2, "media route is found and selected"

    .line 573
    .line 574
    invoke-virtual {v1, p2, p1}, Ly4/b;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 575
    .line 576
    .line 577
    invoke-virtual {v3, v5}, Lt0/C;->l(Z)V

    .line 578
    .line 579
    .line 580
    :cond_12
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 581
    .line 582
    .line 583
    goto/16 :goto_4

    .line 584
    .line 585
    :pswitch_a
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 586
    .line 587
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/cast/C;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 588
    .line 589
    .line 590
    move-result-object p1

    .line 591
    check-cast p1, Landroid/os/Bundle;

    .line 592
    .line 593
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 594
    .line 595
    .line 596
    move-result v0

    .line 597
    invoke-static {p2}, Lcom/google/android/gms/internal/cast/C;->b(Landroid/os/Parcel;)V

    .line 598
    .line 599
    .line 600
    move-object p2, p0

    .line 601
    check-cast p2, Lcom/google/android/gms/internal/cast/t;

    .line 602
    .line 603
    invoke-static {p1}, Lt0/w;->b(Landroid/os/Bundle;)Lt0/w;

    .line 604
    .line 605
    .line 606
    move-result-object p1

    .line 607
    if-nez p1, :cond_13

    .line 608
    .line 609
    goto/16 :goto_a

    .line 610
    .line 611
    :cond_13
    iget-object p2, p2, Lcom/google/android/gms/internal/cast/t;->g:Lt0/D;

    .line 612
    .line 613
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 614
    .line 615
    .line 616
    invoke-static {}, Lt0/D;->b()V

    .line 617
    .line 618
    .line 619
    invoke-static {}, Lt0/D;->c()Lt0/e;

    .line 620
    .line 621
    .line 622
    move-result-object p2

    .line 623
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 624
    .line 625
    .line 626
    invoke-virtual {p1}, Lt0/w;->d()Z

    .line 627
    .line 628
    .line 629
    move-result v1

    .line 630
    if-eqz v1, :cond_14

    .line 631
    .line 632
    goto :goto_a

    .line 633
    :cond_14
    and-int/lit8 v1, v0, 0x2

    .line 634
    .line 635
    if-nez v1, :cond_15

    .line 636
    .line 637
    iget-boolean v1, p2, Lt0/e;->p:Z

    .line 638
    .line 639
    if-eqz v1, :cond_15

    .line 640
    .line 641
    goto :goto_8

    .line 642
    :cond_15
    iget-object v1, p2, Lt0/e;->u:Lt0/F;

    .line 643
    .line 644
    if-eqz v1, :cond_16

    .line 645
    .line 646
    iget-boolean v1, v1, Lt0/F;->b:Z

    .line 647
    .line 648
    if-eqz v1, :cond_16

    .line 649
    .line 650
    invoke-virtual {p2}, Lt0/e;->h()Z

    .line 651
    .line 652
    .line 653
    move-result v1

    .line 654
    if-eqz v1, :cond_16

    .line 655
    .line 656
    move v1, v5

    .line 657
    goto :goto_6

    .line 658
    :cond_16
    move v1, v4

    .line 659
    :goto_6
    iget-object v2, p2, Lt0/e;->i:Ljava/util/ArrayList;

    .line 660
    .line 661
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 662
    .line 663
    .line 664
    move-result v3

    .line 665
    move v6, v4

    .line 666
    :goto_7
    if-ge v6, v3, :cond_1a

    .line 667
    .line 668
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v7

    .line 672
    check-cast v7, Lt0/C;

    .line 673
    .line 674
    and-int/lit8 v8, v0, 0x1

    .line 675
    .line 676
    if-eqz v8, :cond_17

    .line 677
    .line 678
    invoke-virtual {v7}, Lt0/C;->d()Z

    .line 679
    .line 680
    .line 681
    move-result v8

    .line 682
    if-eqz v8, :cond_17

    .line 683
    .line 684
    goto :goto_9

    .line 685
    :cond_17
    if-eqz v1, :cond_18

    .line 686
    .line 687
    invoke-virtual {v7}, Lt0/C;->d()Z

    .line 688
    .line 689
    .line 690
    move-result v8

    .line 691
    if-nez v8, :cond_18

    .line 692
    .line 693
    invoke-virtual {v7}, Lt0/C;->c()Lt0/u;

    .line 694
    .line 695
    .line 696
    move-result-object v8

    .line 697
    iget-object v9, p2, Lt0/e;->r:Lt0/m;

    .line 698
    .line 699
    if-eq v8, v9, :cond_18

    .line 700
    .line 701
    goto :goto_9

    .line 702
    :cond_18
    invoke-virtual {v7, p1}, Lt0/C;->h(Lt0/w;)Z

    .line 703
    .line 704
    .line 705
    move-result v7

    .line 706
    if-eqz v7, :cond_19

    .line 707
    .line 708
    :goto_8
    move v4, v5

    .line 709
    goto :goto_a

    .line 710
    :cond_19
    :goto_9
    add-int/2addr v6, v5

    .line 711
    goto :goto_7

    .line 712
    :cond_1a
    :goto_a
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 713
    .line 714
    .line 715
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 716
    .line 717
    .line 718
    goto/16 :goto_4

    .line 719
    .line 720
    :pswitch_b
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 721
    .line 722
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/cast/C;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 723
    .line 724
    .line 725
    move-result-object p1

    .line 726
    check-cast p1, Landroid/os/Bundle;

    .line 727
    .line 728
    invoke-static {p2}, Lcom/google/android/gms/internal/cast/C;->b(Landroid/os/Parcel;)V

    .line 729
    .line 730
    .line 731
    move-object p2, p0

    .line 732
    check-cast p2, Lcom/google/android/gms/internal/cast/t;

    .line 733
    .line 734
    invoke-static {p1}, Lt0/w;->b(Landroid/os/Bundle;)Lt0/w;

    .line 735
    .line 736
    .line 737
    move-result-object p1

    .line 738
    if-nez p1, :cond_1b

    .line 739
    .line 740
    goto :goto_b

    .line 741
    :cond_1b
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 742
    .line 743
    .line 744
    move-result-object v0

    .line 745
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 746
    .line 747
    .line 748
    move-result-object v1

    .line 749
    if-ne v0, v1, :cond_1c

    .line 750
    .line 751
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/cast/t;->k1(Lt0/w;)V

    .line 752
    .line 753
    .line 754
    goto :goto_b

    .line 755
    :cond_1c
    new-instance v0, LT4/d;

    .line 756
    .line 757
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 758
    .line 759
    .line 760
    move-result-object v1

    .line 761
    invoke-direct {v0, v1, v3}, LT4/d;-><init>(Landroid/os/Looper;I)V

    .line 762
    .line 763
    .line 764
    new-instance v1, Lcom/google/android/gms/internal/cast/r;

    .line 765
    .line 766
    invoke-direct {v1, p2, p1}, Lcom/google/android/gms/internal/cast/r;-><init>(Lcom/google/android/gms/internal/cast/t;Lt0/w;)V

    .line 767
    .line 768
    .line 769
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 770
    .line 771
    .line 772
    :goto_b
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 773
    .line 774
    .line 775
    goto/16 :goto_4

    .line 776
    .line 777
    :pswitch_c
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 778
    .line 779
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/cast/C;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 780
    .line 781
    .line 782
    move-result-object p1

    .line 783
    check-cast p1, Landroid/os/Bundle;

    .line 784
    .line 785
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 786
    .line 787
    .line 788
    move-result v0

    .line 789
    invoke-static {p2}, Lcom/google/android/gms/internal/cast/C;->b(Landroid/os/Parcel;)V

    .line 790
    .line 791
    .line 792
    move-object p2, p0

    .line 793
    check-cast p2, Lcom/google/android/gms/internal/cast/t;

    .line 794
    .line 795
    invoke-static {p1}, Lt0/w;->b(Landroid/os/Bundle;)Lt0/w;

    .line 796
    .line 797
    .line 798
    move-result-object p1

    .line 799
    if-nez p1, :cond_1d

    .line 800
    .line 801
    goto :goto_c

    .line 802
    :cond_1d
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 803
    .line 804
    .line 805
    move-result-object v1

    .line 806
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 807
    .line 808
    .line 809
    move-result-object v2

    .line 810
    if-ne v1, v2, :cond_1e

    .line 811
    .line 812
    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/internal/cast/t;->j1(Lt0/w;I)V

    .line 813
    .line 814
    .line 815
    goto :goto_c

    .line 816
    :cond_1e
    new-instance v1, LT4/d;

    .line 817
    .line 818
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 819
    .line 820
    .line 821
    move-result-object v2

    .line 822
    invoke-direct {v1, v2, v3}, LT4/d;-><init>(Landroid/os/Looper;I)V

    .line 823
    .line 824
    .line 825
    new-instance v2, Lcom/google/android/gms/internal/cast/s;

    .line 826
    .line 827
    invoke-direct {v2, p2, p1, v0, v4}, Lcom/google/android/gms/internal/cast/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 828
    .line 829
    .line 830
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 831
    .line 832
    .line 833
    :goto_c
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 834
    .line 835
    .line 836
    goto/16 :goto_4

    .line 837
    .line 838
    :pswitch_d
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 839
    .line 840
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/cast/C;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 841
    .line 842
    .line 843
    move-result-object p1

    .line 844
    check-cast p1, Landroid/os/Bundle;

    .line 845
    .line 846
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 847
    .line 848
    .line 849
    move-result-object v0

    .line 850
    if-nez v0, :cond_1f

    .line 851
    .line 852
    goto :goto_d

    .line 853
    :cond_1f
    const-string v2, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback"

    .line 854
    .line 855
    invoke-interface {v0, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 856
    .line 857
    .line 858
    move-result-object v3

    .line 859
    instance-of v4, v3, Lcom/google/android/gms/internal/cast/l;

    .line 860
    .line 861
    if-eqz v4, :cond_20

    .line 862
    .line 863
    move-object v7, v3

    .line 864
    check-cast v7, Lcom/google/android/gms/internal/cast/l;

    .line 865
    .line 866
    goto :goto_d

    .line 867
    :cond_20
    new-instance v7, Lcom/google/android/gms/internal/cast/l;

    .line 868
    .line 869
    invoke-direct {v7, v0, v2, v1}, LS4/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 870
    .line 871
    .line 872
    :goto_d
    invoke-static {p2}, Lcom/google/android/gms/internal/cast/C;->b(Landroid/os/Parcel;)V

    .line 873
    .line 874
    .line 875
    move-object p2, p0

    .line 876
    check-cast p2, Lcom/google/android/gms/internal/cast/t;

    .line 877
    .line 878
    invoke-static {p1}, Lt0/w;->b(Landroid/os/Bundle;)Lt0/w;

    .line 879
    .line 880
    .line 881
    move-result-object p1

    .line 882
    if-nez p1, :cond_21

    .line 883
    .line 884
    goto :goto_e

    .line 885
    :cond_21
    iget-object v0, p2, Lcom/google/android/gms/internal/cast/t;->i:Ljava/util/HashMap;

    .line 886
    .line 887
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 888
    .line 889
    .line 890
    move-result v1

    .line 891
    if-nez v1, :cond_22

    .line 892
    .line 893
    new-instance v1, Ljava/util/HashSet;

    .line 894
    .line 895
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 896
    .line 897
    .line 898
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 899
    .line 900
    .line 901
    :cond_22
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 902
    .line 903
    .line 904
    move-result-object p1

    .line 905
    check-cast p1, Ljava/util/Set;

    .line 906
    .line 907
    new-instance v0, Lcom/google/android/gms/internal/cast/m;

    .line 908
    .line 909
    iget-object v1, p2, Lcom/google/android/gms/internal/cast/t;->j:Lcom/google/android/gms/internal/cast/w;

    .line 910
    .line 911
    invoke-direct {v0, v7, p2, v1}, Lcom/google/android/gms/internal/cast/m;-><init>(Lcom/google/android/gms/internal/cast/l;Lcom/google/android/gms/internal/cast/t;Lcom/google/android/gms/internal/cast/w;)V

    .line 912
    .line 913
    .line 914
    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 915
    .line 916
    .line 917
    :goto_e
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 918
    .line 919
    .line 920
    goto/16 :goto_4

    .line 921
    .line 922
    :goto_f
    return v4

    .line 923
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
.end method
