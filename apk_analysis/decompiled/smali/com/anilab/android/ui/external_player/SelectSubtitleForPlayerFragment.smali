.class public final Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;
.super LT1/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LT1/b<",
        "LJ1/y0;",
        "LT1/G;",
        ">;"
    }
.end annotation


# instance fields
.field public final S0:LY2/r;

.field public final T0:LY2/r;

.field public final U0:LA7/l;

.field public final V0:LJ5/j;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, LT1/b;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LT1/y;

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    invoke-direct {v0, p0, v1}, LT1/y;-><init>(Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;I)V

    .line 8
    .line 9
    .line 10
    sget-object v1, LA7/f;->a:LA7/f;

    .line 11
    .line 12
    new-instance v2, LN1/r;

    .line 13
    .line 14
    const/16 v3, 0x9

    .line 15
    .line 16
    invoke-direct {v2, v3, v0}, LN1/r;-><init>(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v2}, LZ0/a;->p(LA7/f;LO7/a;)LA7/e;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-class v1, LT1/G;

    .line 24
    .line 25
    invoke-static {v1}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    new-instance v2, LN1/s;

    .line 30
    .line 31
    const/16 v3, 0xc

    .line 32
    .line 33
    invoke-direct {v2, v0, v3}, LN1/s;-><init>(LA7/e;I)V

    .line 34
    .line 35
    .line 36
    new-instance v3, LN1/s;

    .line 37
    .line 38
    const/16 v4, 0xd

    .line 39
    .line 40
    invoke-direct {v3, v0, v4}, LN1/s;-><init>(LA7/e;I)V

    .line 41
    .line 42
    .line 43
    new-instance v4, LN1/t;

    .line 44
    .line 45
    const/4 v5, 0x6

    .line 46
    invoke-direct {v4, p0, v0, v5}, LN1/t;-><init>(Li0/v;LA7/e;I)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0, v1, v2, v3, v4}, LM4/a;->i(Li0/v;Lkotlin/jvm/internal/d;LO7/a;LO7/a;LO7/a;)LY2/r;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;->S0:LY2/r;

    .line 54
    .line 55
    const-class v0, LL1/S;

    .line 56
    .line 57
    invoke-static {v0}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    new-instance v1, LT1/y;

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    invoke-direct {v1, p0, v2}, LT1/y;-><init>(Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;I)V

    .line 65
    .line 66
    .line 67
    new-instance v2, LT1/y;

    .line 68
    .line 69
    const/4 v3, 0x1

    .line 70
    invoke-direct {v2, p0, v3}, LT1/y;-><init>(Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;I)V

    .line 71
    .line 72
    .line 73
    new-instance v3, LT1/y;

    .line 74
    .line 75
    const/4 v4, 0x2

    .line 76
    invoke-direct {v3, p0, v4}, LT1/y;-><init>(Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;I)V

    .line 77
    .line 78
    .line 79
    invoke-static {p0, v0, v1, v2, v3}, LM4/a;->i(Li0/v;Lkotlin/jvm/internal/d;LO7/a;LO7/a;LO7/a;)LY2/r;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iput-object v0, p0, Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;->T0:LY2/r;

    .line 84
    .line 85
    new-instance v0, LC2/P;

    .line 86
    .line 87
    const/4 v1, 0x7

    .line 88
    invoke-direct {v0, v1}, LC2/P;-><init>(I)V

    .line 89
    .line 90
    .line 91
    invoke-static {v0}, LZ0/a;->q(LO7/a;)LA7/l;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iput-object v0, p0, Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;->U0:LA7/l;

    .line 96
    .line 97
    new-instance v0, LJ5/j;

    .line 98
    .line 99
    const/4 v1, 0x2

    .line 100
    invoke-direct {v0, v1, p0}, LJ5/j;-><init>(ILjava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    iput-object v0, p0, Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;->V0:LJ5/j;

    .line 104
    .line 105
    return-void
    .line 106
    .line 107
    .line 108
.end method

.method public static final t0(Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, LM1/g;->m0()LW/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LJ1/y0;

    .line 6
    .line 7
    iget-object v1, v0, LJ1/y0;->C:Lcom/google/android/material/tabs/TabLayout;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v1, v2}, Lcom/google/android/material/tabs/TabLayout;->h(I)LJ5/f;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    const/4 v4, 0x1

    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    iget-object v3, v3, LJ5/f;->g:LJ5/h;

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;->u0()LT1/G;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    iget-object v6, v5, LT1/G;->l:LI2/a;

    .line 26
    .line 27
    iget-object v6, v6, LI2/a;->e:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-nez v6, :cond_0

    .line 34
    .line 35
    iget-object v5, v5, LT1/G;->l:LI2/a;

    .line 36
    .line 37
    iget-object v5, v5, LI2/a;->f:Ljava/util/List;

    .line 38
    .line 39
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-nez v5, :cond_0

    .line 44
    .line 45
    move v5, v4

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move v5, v2

    .line 48
    :goto_0
    invoke-virtual {v3, v5}, Landroid/view/View;->setClickable(Z)V

    .line 49
    .line 50
    .line 51
    :cond_1
    invoke-virtual {v1, v4}, Lcom/google/android/material/tabs/TabLayout;->h(I)LJ5/f;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    iget-object v3, v3, LJ5/f;->g:LJ5/h;

    .line 58
    .line 59
    if-eqz v3, :cond_3

    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;->u0()LT1/G;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    iget-object v6, v5, LT1/G;->l:LI2/a;

    .line 66
    .line 67
    iget-object v6, v6, LI2/a;->e:Ljava/util/List;

    .line 68
    .line 69
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-nez v6, :cond_2

    .line 74
    .line 75
    iget-object v5, v5, LT1/G;->l:LI2/a;

    .line 76
    .line 77
    iget-object v5, v5, LI2/a;->f:Ljava/util/List;

    .line 78
    .line 79
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-nez v5, :cond_2

    .line 84
    .line 85
    move v5, v4

    .line 86
    goto :goto_1

    .line 87
    :cond_2
    move v5, v2

    .line 88
    :goto_1
    invoke-virtual {v3, v5}, Landroid/view/View;->setClickable(Z)V

    .line 89
    .line 90
    .line 91
    :cond_3
    invoke-virtual {p0}, Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;->u0()LT1/G;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    iget-boolean v3, v3, LT1/G;->o:Z

    .line 96
    .line 97
    if-eqz v3, :cond_4

    .line 98
    .line 99
    invoke-virtual {v1, v4}, Lcom/google/android/material/tabs/TabLayout;->h(I)LJ5/f;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    goto :goto_2

    .line 104
    :cond_4
    invoke-virtual {v1, v2}, Lcom/google/android/material/tabs/TabLayout;->h(I)LJ5/f;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    :goto_2
    if-eqz v3, :cond_5

    .line 109
    .line 110
    invoke-virtual {v3}, LJ5/f;->a()Z

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    if-nez v5, :cond_5

    .line 115
    .line 116
    invoke-virtual {v1, v3, v4}, Lcom/google/android/material/tabs/TabLayout;->k(LJ5/f;Z)V

    .line 117
    .line 118
    .line 119
    :cond_5
    const-string v1, "scrollViewServer"

    .line 120
    .line 121
    iget-object v3, v0, LJ1/y0;->B:Landroid/widget/HorizontalScrollView;

    .line 122
    .line 123
    invoke-static {v3, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;->u0()LT1/G;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    iget-boolean v5, v1, LT1/G;->o:Z

    .line 131
    .line 132
    iget-object v1, v1, LT1/G;->l:LI2/a;

    .line 133
    .line 134
    if-eqz v5, :cond_6

    .line 135
    .line 136
    iget-object v1, v1, LI2/a;->f:Ljava/util/List;

    .line 137
    .line 138
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-le v1, v4, :cond_7

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_6
    iget-object v1, v1, LI2/a;->e:Ljava/util/List;

    .line 146
    .line 147
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    if-le v1, v4, :cond_7

    .line 152
    .line 153
    :goto_3
    move v1, v2

    .line 154
    goto :goto_4

    .line 155
    :cond_7
    const/16 v1, 0x8

    .line 156
    .line 157
    :goto_4
    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 158
    .line 159
    .line 160
    const-string v1, "chipGroupServer"

    .line 161
    .line 162
    iget-object v0, v0, LJ1/y0;->x:Lcom/google/android/material/chip/ChipGroup;

    .line 163
    .line 164
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0}, Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;->u0()LT1/G;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    iget-boolean v1, v1, LT1/G;->o:Z

    .line 172
    .line 173
    if-eqz v1, :cond_8

    .line 174
    .line 175
    invoke-virtual {p0}, Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;->u0()LT1/G;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    iget-object v1, v1, LT1/G;->l:LI2/a;

    .line 180
    .line 181
    iget-object v1, v1, LI2/a;->f:Ljava/util/List;

    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_8
    invoke-virtual {p0}, Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;->u0()LT1/G;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    iget-object v1, v1, LT1/G;->l:LI2/a;

    .line 189
    .line 190
    iget-object v1, v1, LI2/a;->e:Ljava/util/List;

    .line 191
    .line 192
    :goto_5
    invoke-virtual {p0}, Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;->u0()LT1/G;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    iget-object v3, v3, LT1/G;->l:LI2/a;

    .line 197
    .line 198
    iget-object v3, v3, LI2/a;->g:LI2/b;

    .line 199
    .line 200
    iget-object v3, v3, LI2/b;->b:Ljava/lang/String;

    .line 201
    .line 202
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 203
    .line 204
    .line 205
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    :cond_9
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    if-eqz v4, :cond_c

    .line 214
    .line 215
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    check-cast v4, LI2/b;

    .line 220
    .line 221
    iget-object v5, p0, Li0/v;->i0:Landroid/view/LayoutInflater;

    .line 222
    .line 223
    const/4 v6, 0x0

    .line 224
    if-nez v5, :cond_a

    .line 225
    .line 226
    invoke-virtual {p0, v6}, LT1/b;->K(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    iput-object v5, p0, Li0/v;->i0:Landroid/view/LayoutInflater;

    .line 231
    .line 232
    :cond_a
    const v7, 0x7f0d006c

    .line 233
    .line 234
    .line 235
    invoke-virtual {v5, v7, v0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    instance-of v7, v5, Lcom/google/android/material/chip/Chip;

    .line 240
    .line 241
    if-eqz v7, :cond_b

    .line 242
    .line 243
    move-object v6, v5

    .line 244
    check-cast v6, Lcom/google/android/material/chip/Chip;

    .line 245
    .line 246
    :cond_b
    if-eqz v6, :cond_9

    .line 247
    .line 248
    iget-object v5, v4, LI2/b;->a:Ljava/lang/String;

    .line 249
    .line 250
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    invoke-virtual {v6, v5}, Landroid/view/View;->setId(I)V

    .line 255
    .line 256
    .line 257
    iget-object v5, v4, LI2/b;->a:Ljava/lang/String;

    .line 258
    .line 259
    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 260
    .line 261
    .line 262
    iget-object v4, v4, LI2/b;->b:Ljava/lang/String;

    .line 263
    .line 264
    invoke-static {v4, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    invoke-virtual {v6, v4}, Lcom/google/android/material/chip/Chip;->setChecked(Z)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 272
    .line 273
    .line 274
    goto :goto_6

    .line 275
    :cond_c
    return-void
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
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


# virtual methods
.method public final Q()V
    .locals 2

    .line 1
    invoke-super {p0}, Li0/n;->Q()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LM1/g;->m0()LW/g;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, LJ1/y0;

    .line 9
    .line 10
    iget-object v0, v0, LJ1/y0;->C:Lcom/google/android/material/tabs/TabLayout;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;->V0:LJ5/j;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->a(LJ5/b;)V

    .line 15
    .line 16
    .line 17
    return-void
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
.end method

.method public final R()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LM1/g;->m0()LW/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LJ1/y0;

    .line 6
    .line 7
    iget-object v0, v0, LJ1/y0;->C:Lcom/google/android/material/tabs/TabLayout;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/google/android/material/tabs/TabLayout;->m0:Ljava/util/ArrayList;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;->V0:LJ5/j;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    invoke-super {p0}, Li0/n;->R()V

    .line 17
    .line 18
    .line 19
    return-void
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
.end method

.method public final n0()I
    .locals 1

    .line 1
    const v0, 0x7f0d0061

    return v0
.end method

.method public final o0(I)V
    .locals 8

    .line 1
    const v0, 0x7f0a0071

    .line 2
    .line 3
    .line 4
    if-eq p1, v0, :cond_9

    .line 5
    .line 6
    const v0, 0x7f0a00a3

    .line 7
    .line 8
    .line 9
    if-eq p1, v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;->u0()LT1/G;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object p1, p1, LT1/G;->j:Lb8/Q;

    .line 17
    .line 18
    invoke-virtual {p1}, Lb8/Q;->h()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Ljava/util/Map;

    .line 23
    .line 24
    sget-object v0, LJ2/c;->b:LJ2/c;

    .line 25
    .line 26
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-nez p1, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;->u0()LT1/G;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object p1, p1, LT1/G;->l:LI2/a;

    .line 37
    .line 38
    iget-object p1, p1, LI2/a;->g:LI2/b;

    .line 39
    .line 40
    iget-object p1, p1, LI2/b;->b:Ljava/lang/String;

    .line 41
    .line 42
    :cond_1
    check-cast p1, Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;->u0()LT1/G;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v0, v0, LT1/G;->l:LI2/a;

    .line 49
    .line 50
    iget-object v0, v0, LI2/a;->c:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v0}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    iget-object v2, p0, Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;->T0:LY2/r;

    .line 57
    .line 58
    const-string v3, ""

    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    invoke-virtual {v2}, LY2/r;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, LL1/S;

    .line 68
    .line 69
    iget-object v0, v0, LL1/S;->A:LH2/s;

    .line 70
    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    iget-object v0, v0, LH2/s;->b:Ljava/lang/String;

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    move-object v0, v4

    .line 77
    :goto_0
    if-nez v0, :cond_3

    .line 78
    .line 79
    move-object v0, v3

    .line 80
    :cond_3
    iget-object v1, p0, Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;->U0:LA7/l;

    .line 81
    .line 82
    invoke-virtual {v1}, LA7/l;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    check-cast v5, Ln2/h;

    .line 87
    .line 88
    invoke-virtual {v5}, Ln2/h;->r()LI2/c;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    if-eqz v5, :cond_4

    .line 93
    .line 94
    iget-object v6, v5, LI2/c;->c:Ljava/lang/String;

    .line 95
    .line 96
    invoke-static {v6}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    if-eqz v7, :cond_5

    .line 101
    .line 102
    iget-object v6, v5, LI2/c;->b:Ljava/lang/String;

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_4
    move-object v6, v4

    .line 106
    :cond_5
    :goto_1
    if-nez v6, :cond_6

    .line 107
    .line 108
    move-object v6, v3

    .line 109
    :cond_6
    invoke-virtual {v1}, LA7/l;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    check-cast v1, Ln2/h;

    .line 114
    .line 115
    invoke-virtual {v1}, Ln2/h;->r()LI2/c;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    if-eqz v1, :cond_7

    .line 120
    .line 121
    iget-object v1, v1, LI2/c;->d:Ljava/lang/String;

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_7
    move-object v1, v4

    .line 125
    :goto_2
    if-nez v1, :cond_8

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_8
    move-object v3, v1

    .line 129
    :goto_3
    invoke-virtual {v2}, LY2/r;->getValue()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    check-cast v1, LL1/S;

    .line 134
    .line 135
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    const-string v2, "hlsUrl"

    .line 139
    .line 140
    invoke-static {p1, v2}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    new-instance v2, LM1/t;

    .line 144
    .line 145
    new-instance v5, LL1/D;

    .line 146
    .line 147
    invoke-direct {v5, v0, p1, v6, v3}, LL1/D;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-direct {v2, v5}, LM1/t;-><init>(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    iget-object p1, v1, LL1/S;->u:Lb8/Q;

    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, v4, v2}, Lb8/Q;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :cond_9
    invoke-virtual {p0}, Lm5/g;->l0()V

    .line 163
    .line 164
    .line 165
    return-void
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
.end method

.method public final p0()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;->T0:LY2/r;

    .line 2
    .line 3
    invoke-virtual {v0}, LY2/r;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, LL1/S;

    .line 8
    .line 9
    iget-object v1, v1, LL1/S;->A:LH2/s;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-wide v3, v1, LH2/s;->a:J

    .line 15
    .line 16
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v1, v2

    .line 22
    :goto_0
    invoke-virtual {v0}, LY2/r;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, LL1/S;

    .line 27
    .line 28
    iget-object v0, v0, LL1/S;->A:LH2/s;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-wide v3, v0, LH2/s;->d:J

    .line 33
    .line 34
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move-object v0, v2

    .line 40
    :goto_1
    if-nez v1, :cond_4

    .line 41
    .line 42
    invoke-virtual {p0}, Li0/v;->k()Li0/y;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    instance-of v1, v0, Lcom/anilab/android/ui/activity/MainActivity;

    .line 47
    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    move-object v2, v0

    .line 51
    check-cast v2, Lcom/anilab/android/ui/activity/MainActivity;

    .line 52
    .line 53
    :cond_2
    if-eqz v2, :cond_3

    .line 54
    .line 55
    new-instance v0, LM1/D;

    .line 56
    .line 57
    const v1, 0x7f140180

    .line 58
    .line 59
    .line 60
    invoke-direct {v0, v1}, LM1/D;-><init>(I)V

    .line 61
    .line 62
    .line 63
    sget v1, Lcom/anilab/android/ui/activity/MainActivity;->k0:I

    .line 64
    .line 65
    invoke-virtual {v2, v0}, Lcom/anilab/android/ui/activity/MainActivity;->Z(LM1/E;)V

    .line 66
    .line 67
    .line 68
    :cond_3
    invoke-virtual {p0}, Lm5/g;->l0()V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_4
    invoke-virtual {p0}, Li0/v;->t()Li0/W;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-static {v3}, Landroidx/lifecycle/Y;->f(Landroidx/lifecycle/w;)Landroidx/lifecycle/r;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    new-instance v4, LT1/x;

    .line 81
    .line 82
    invoke-direct {v4, v2, p0}, LT1/x;-><init>(LE7/d;Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;)V

    .line 83
    .line 84
    .line 85
    const/4 v5, 0x3

    .line 86
    invoke-static {v3, v2, v4, v5}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;->u0()LT1/G;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 94
    .line 95
    .line 96
    move-result-wide v4

    .line 97
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    const/4 v1, 0x1

    .line 101
    if-eqz v0, :cond_5

    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 104
    .line 105
    .line 106
    move-result-wide v6

    .line 107
    const-wide/16 v8, 0x0

    .line 108
    .line 109
    cmp-long v6, v6, v8

    .line 110
    .line 111
    if-lez v6, :cond_5

    .line 112
    .line 113
    new-instance v4, LT1/D;

    .line 114
    .line 115
    invoke-direct {v4, v3, v0, v2}, LT1/D;-><init>(LT1/G;Ljava/lang/Long;LE7/d;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3, v1, v4}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_5
    new-instance v0, LT1/E;

    .line 123
    .line 124
    invoke-direct {v0, v3, v4, v5, v2}, LT1/E;-><init>(LT1/G;JLE7/d;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v3, v1, v0}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 128
    .line 129
    .line 130
    return-void
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
.end method

.method public final q0(LW/g;)Ljava/util/List;
    .locals 3

    .line 1
    check-cast p1, LJ1/y0;

    .line 2
    .line 3
    iget-object v0, p1, LJ1/y0;->v:Lcom/google/android/material/button/MaterialButton;

    .line 4
    .line 5
    iget-object p1, p1, LJ1/y0;->w:Lcom/google/android/material/button/MaterialButton;

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    new-array v1, v1, [Lcom/google/android/material/button/MaterialButton;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    aput-object v0, v1, v2

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    aput-object p1, v1, v0

    .line 15
    .line 16
    invoke-static {v1}, LB7/l;->b0([Ljava/lang/Object;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
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
.end method

.method public final r0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LM1/g;->m0()LW/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LJ1/y0;

    .line 6
    .line 7
    iget-object v0, v0, LJ1/y0;->A:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, LM1/g;->m0()LW/g;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, LJ1/y0;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;->U0:LA7/l;

    .line 20
    .line 21
    invoke-virtual {v1}, LA7/l;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ln2/h;

    .line 26
    .line 27
    iget-object v0, v0, LJ1/y0;->A:Landroidx/recyclerview/widget/RecyclerView;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(LF0/S;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final u0()LT1/G;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/android/ui/external_player/SelectSubtitleForPlayerFragment;->S0:LY2/r;

    .line 2
    .line 3
    invoke-virtual {v0}, LY2/r;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LT1/G;

    .line 8
    .line 9
    return-object v0
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
.end method
