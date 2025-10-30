.class public final synthetic LG0/h;
.super Lkotlin/jvm/internal/g;
.source "SourceFile"

# interfaces
.implements LO7/l;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    iput p7, p0, LG0/h;->a:I

    invoke-direct/range {p0 .. p6}, Lkotlin/jvm/internal/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    const-string v3, "p0"

    .line 5
    .line 6
    sget-object v4, LA7/n;->a:LA7/n;

    .line 7
    .line 8
    iget v5, p0, LG0/h;->a:I

    .line 9
    .line 10
    packed-switch v5, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, Lcom/anilab/domain/model/Movie;

    .line 14
    .line 15
    invoke-static {p1, v3}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lkotlin/jvm/internal/b;->receiver:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lcom/anilab/android/ui/search/SearchFragment;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance v1, LI1/n;

    .line 26
    .line 27
    invoke-direct {v1, p1, v2, v2}, LI1/n;-><init>(Lcom/anilab/domain/model/Movie;Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, LM1/n;->j0(Lu0/D;)V

    .line 31
    .line 32
    .line 33
    return-object v4

    .line 34
    :pswitch_0
    check-cast p1, Lcom/anilab/domain/model/Movie;

    .line 35
    .line 36
    invoke-static {p1, v3}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lkotlin/jvm/internal/b;->receiver:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Lcom/anilab/android/ui/search/SearchFragment;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    new-instance v1, LI1/n;

    .line 47
    .line 48
    invoke-direct {v1, p1, v2, v2}, LI1/n;-><init>(Lcom/anilab/domain/model/Movie;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, LM1/n;->j0(Lu0/D;)V

    .line 52
    .line 53
    .line 54
    return-object v4

    .line 55
    :pswitch_1
    check-cast p1, Lcom/anilab/domain/model/Movie;

    .line 56
    .line 57
    invoke-static {p1, v3}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lkotlin/jvm/internal/b;->receiver:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Lcom/anilab/android/ui/releaseCalendar/ReleaseCalendarFragment;

    .line 63
    .line 64
    iget-object v0, v0, Li0/v;->v:Li0/v;

    .line 65
    .line 66
    if-eqz v0, :cond_0

    .line 67
    .line 68
    iget-object v0, v0, Li0/v;->v:Li0/v;

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    move-object v0, v2

    .line 72
    :goto_0
    instance-of v1, v0, Lcom/anilab/android/ui/main/HostFragment;

    .line 73
    .line 74
    if-eqz v1, :cond_1

    .line 75
    .line 76
    move-object v2, v0

    .line 77
    check-cast v2, Lcom/anilab/android/ui/main/HostFragment;

    .line 78
    .line 79
    :cond_1
    if-eqz v2, :cond_2

    .line 80
    .line 81
    invoke-static {v2, p1}, Lcom/anilab/android/ui/main/HostFragment;->y0(Lcom/anilab/android/ui/main/HostFragment;Lcom/anilab/domain/model/Movie;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    return-object v4

    .line 85
    :pswitch_2
    check-cast p1, LH2/b;

    .line 86
    .line 87
    invoke-static {p1, v3}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Lkotlin/jvm/internal/b;->receiver:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, Lcom/anilab/android/ui/releaseCalendar/ReleaseCalendarFragment;

    .line 93
    .line 94
    iget-object v1, v0, Lcom/anilab/android/ui/releaseCalendar/ReleaseCalendarFragment;->F0:LA7/l;

    .line 95
    .line 96
    invoke-virtual {v1}, LA7/l;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    check-cast v1, Lk2/f;

    .line 101
    .line 102
    invoke-virtual {v0}, Lcom/anilab/android/ui/releaseCalendar/ReleaseCalendarFragment;->t0()Lk2/m;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {v3, p1}, Lk2/m;->g(LH2/b;)Ljava/util/ArrayList;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iget-object v3, v1, Lk2/f;->g:Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1}, LF0/S;->d()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, LM1/n;->e0()LW/g;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    check-cast p1, LJ1/s0;

    .line 126
    .line 127
    iget-object p1, p1, LJ1/s0;->x:Landroidx/recyclerview/widget/RecyclerView;

    .line 128
    .line 129
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/a;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    instance-of v1, p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 134
    .line 135
    if-eqz v1, :cond_3

    .line 136
    .line 137
    move-object v2, p1

    .line 138
    check-cast v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 139
    .line 140
    :cond_3
    if-eqz v2, :cond_4

    .line 141
    .line 142
    invoke-virtual {v0}, Lcom/anilab/android/ui/releaseCalendar/ReleaseCalendarFragment;->s0()Lk2/b;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    iget p1, p1, Lk2/b;->f:I

    .line 147
    .line 148
    invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->x0(I)V

    .line 149
    .line 150
    .line 151
    :cond_4
    return-object v4

    .line 152
    :pswitch_3
    check-cast p1, Lcom/anilab/domain/model/Movie;

    .line 153
    .line 154
    invoke-static {p1, v3}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    iget-object v0, p0, Lkotlin/jvm/internal/b;->receiver:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, Lcom/anilab/android/ui/movieDetail/MovieDetailFragment;

    .line 160
    .line 161
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    new-instance v1, LI1/n;

    .line 165
    .line 166
    invoke-direct {v1, p1, v2, v2}, LI1/n;-><init>(Lcom/anilab/domain/model/Movie;Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v1}, LM1/n;->j0(Lu0/D;)V

    .line 170
    .line 171
    .line 172
    return-object v4

    .line 173
    :pswitch_4
    check-cast p1, Ljava/lang/Throwable;

    .line 174
    .line 175
    iget-object v0, p0, Lkotlin/jvm/internal/b;->receiver:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v0, LY7/d0;

    .line 178
    .line 179
    invoke-interface {v0, p1}, LY7/d0;->d(Ljava/lang/Throwable;)V

    .line 180
    .line 181
    .line 182
    return-object v4

    .line 183
    :pswitch_5
    check-cast p1, Lcom/anilab/domain/model/Movie;

    .line 184
    .line 185
    invoke-static {p1, v3}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    iget-object v0, p0, Lkotlin/jvm/internal/b;->receiver:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v0, Lcom/anilab/android/ui/filterResult/FilterResultFragment;

    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    new-instance v1, LI1/n;

    .line 196
    .line 197
    invoke-direct {v1, p1, v2, v2}, LI1/n;-><init>(Lcom/anilab/domain/model/Movie;Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, v1}, LM1/n;->j0(Lu0/D;)V

    .line 201
    .line 202
    .line 203
    return-object v4

    .line 204
    :pswitch_6
    check-cast p1, LH2/a;

    .line 205
    .line 206
    invoke-static {p1, v3}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    iget-object v2, p0, Lkotlin/jvm/internal/b;->receiver:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v2, Lcom/anilab/android/ui/editProfile/EditProfileFragment;

    .line 212
    .line 213
    invoke-virtual {v2}, LM1/n;->e0()LW/g;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    check-cast v3, LJ1/H;

    .line 218
    .line 219
    const-string v5, "groupSelectAvatar"

    .line 220
    .line 221
    iget-object v3, v3, LJ1/H;->y:Landroidx/constraintlayout/widget/Group;

    .line 222
    .line 223
    invoke-static {v3, v5}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    const/16 v5, 0x8

    .line 227
    .line 228
    invoke-virtual {v3, v5}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2}, LM1/n;->e0()LW/g;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    check-cast v3, LJ1/H;

    .line 236
    .line 237
    const-string v5, "imageAvatar"

    .line 238
    .line 239
    iget-object v3, v3, LJ1/H;->z:Landroidx/appcompat/widget/AppCompatImageView;

    .line 240
    .line 241
    invoke-static {v3, v5}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 245
    .line 246
    .line 247
    move-result-object v5

    .line 248
    invoke-static {v5}, Lt1/a;->a(Landroid/content/Context;)Lt1/m;

    .line 249
    .line 250
    .line 251
    move-result-object v5

    .line 252
    new-instance v6, LC1/h;

    .line 253
    .line 254
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 255
    .line 256
    .line 257
    move-result-object v7

    .line 258
    invoke-direct {v6, v7}, LC1/h;-><init>(Landroid/content/Context;)V

    .line 259
    .line 260
    .line 261
    iget-object v7, p1, LH2/a;->b:Ljava/lang/String;

    .line 262
    .line 263
    iput-object v7, v6, LC1/h;->c:Ljava/lang/Object;

    .line 264
    .line 265
    invoke-virtual {v6, v3}, LC1/h;->b(Landroid/widget/ImageView;)V

    .line 266
    .line 267
    .line 268
    new-instance v3, LF1/a;

    .line 269
    .line 270
    invoke-direct {v3}, LF1/a;-><init>()V

    .line 271
    .line 272
    .line 273
    new-array v1, v1, [LF1/c;

    .line 274
    .line 275
    aput-object v3, v1, v0

    .line 276
    .line 277
    invoke-static {v1}, LB7/j;->o0([Ljava/lang/Object;)Ljava/util/List;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/u1;->e0(Ljava/util/List;)Ljava/util/List;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    iput-object v0, v6, LC1/h;->e:Ljava/util/List;

    .line 286
    .line 287
    invoke-virtual {v6}, LC1/h;->a()LC1/i;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-virtual {v5, v0}, Lt1/m;->b(LC1/i;)LC1/k;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v2}, Lcom/anilab/android/ui/editProfile/EditProfileFragment;->s0()LS1/l;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    iget-wide v1, p1, LH2/a;->a:J

    .line 299
    .line 300
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    iput-object p1, v0, LS1/l;->m:Ljava/lang/Long;

    .line 305
    .line 306
    return-object v4

    .line 307
    :pswitch_7
    check-cast p1, Lcom/anilab/domain/model/Movie;

    .line 308
    .line 309
    invoke-static {p1, v3}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    iget-object v0, p0, Lkotlin/jvm/internal/b;->receiver:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v0, Lcom/anilab/android/ui/categoryDetail/MovieListFragment;

    .line 315
    .line 316
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    new-instance v1, LI1/n;

    .line 320
    .line 321
    invoke-direct {v1, p1, v2, v2}, LI1/n;-><init>(Lcom/anilab/domain/model/Movie;Ljava/lang/String;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0, v1}, LM1/n;->j0(Lu0/D;)V

    .line 325
    .line 326
    .line 327
    return-object v4

    .line 328
    :pswitch_8
    check-cast p1, Ljava/util/Set;

    .line 329
    .line 330
    invoke-static {p1, v3}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    iget-object v2, p0, Lkotlin/jvm/internal/b;->receiver:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast v2, LG0/k;

    .line 336
    .line 337
    iget-object v3, v2, LG0/k;->e:Ljava/util/concurrent/locks/ReentrantLock;

    .line 338
    .line 339
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 340
    .line 341
    .line 342
    :try_start_0
    iget-object v2, v2, LG0/k;->d:Ljava/util/LinkedHashMap;

    .line 343
    .line 344
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    invoke-static {v2}, LB7/k;->H0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 349
    .line 350
    .line 351
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 352
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 353
    .line 354
    .line 355
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    :cond_5
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 360
    .line 361
    .line 362
    move-result v3

    .line 363
    if-eqz v3, :cond_b

    .line 364
    .line 365
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v3

    .line 369
    check-cast v3, LG0/t;

    .line 370
    .line 371
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    iget-object v5, v3, LG0/t;->b:[I

    .line 375
    .line 376
    array-length v6, v5

    .line 377
    sget-object v7, LB7/v;->a:LB7/v;

    .line 378
    .line 379
    if-eqz v6, :cond_9

    .line 380
    .line 381
    if-eq v6, v1, :cond_8

    .line 382
    .line 383
    new-instance v6, LC7/j;

    .line 384
    .line 385
    invoke-direct {v6}, LC7/j;-><init>()V

    .line 386
    .line 387
    .line 388
    array-length v7, v5

    .line 389
    move v8, v0

    .line 390
    move v9, v8

    .line 391
    :goto_2
    if-ge v8, v7, :cond_7

    .line 392
    .line 393
    aget v10, v5, v8

    .line 394
    .line 395
    add-int/lit8 v11, v9, 0x1

    .line 396
    .line 397
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 398
    .line 399
    .line 400
    move-result-object v10

    .line 401
    invoke-interface {p1, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    move-result v10

    .line 405
    if-eqz v10, :cond_6

    .line 406
    .line 407
    iget-object v10, v3, LG0/t;->c:[Ljava/lang/String;

    .line 408
    .line 409
    aget-object v9, v10, v9

    .line 410
    .line 411
    invoke-virtual {v6, v9}, LC7/j;->add(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    :cond_6
    add-int/2addr v8, v1

    .line 415
    move v9, v11

    .line 416
    goto :goto_2

    .line 417
    :cond_7
    invoke-static {v6}, LO4/h;->e(LC7/j;)LC7/j;

    .line 418
    .line 419
    .line 420
    move-result-object v7

    .line 421
    goto :goto_3

    .line 422
    :cond_8
    aget v5, v5, v0

    .line 423
    .line 424
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 425
    .line 426
    .line 427
    move-result-object v5

    .line 428
    invoke-interface {p1, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    move-result v5

    .line 432
    if-eqz v5, :cond_9

    .line 433
    .line 434
    iget-object v7, v3, LG0/t;->d:Ljava/util/Set;

    .line 435
    .line 436
    :cond_9
    :goto_3
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 437
    .line 438
    .line 439
    move-result v5

    .line 440
    if-nez v5, :cond_5

    .line 441
    .line 442
    iget-object v3, v3, LG0/t;->a:LA1/g;

    .line 443
    .line 444
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    iget-object v3, v3, LA1/g;->c:Ljava/lang/Object;

    .line 448
    .line 449
    check-cast v3, LG0/o;

    .line 450
    .line 451
    iget-object v5, v3, LG0/o;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 452
    .line 453
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 454
    .line 455
    .line 456
    move-result v5

    .line 457
    if-eqz v5, :cond_a

    .line 458
    .line 459
    goto :goto_1

    .line 460
    :cond_a
    :try_start_1
    iget-object v5, v3, LG0/o;->g:LG0/f;

    .line 461
    .line 462
    if-eqz v5, :cond_5

    .line 463
    .line 464
    iget v3, v3, LG0/o;->f:I

    .line 465
    .line 466
    new-array v6, v0, [Ljava/lang/String;

    .line 467
    .line 468
    invoke-interface {v7, v6}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v6

    .line 472
    check-cast v6, [Ljava/lang/String;

    .line 473
    .line 474
    invoke-interface {v5, v3, v6}, LG0/f;->M0(I[Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 475
    .line 476
    .line 477
    goto :goto_1

    .line 478
    :catch_0
    move-exception v3

    .line 479
    const-string v5, "ROOM"

    .line 480
    .line 481
    const-string v6, "Cannot broadcast invalidation"

    .line 482
    .line 483
    invoke-static {v5, v6, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 484
    .line 485
    .line 486
    goto :goto_1

    .line 487
    :cond_b
    return-object v4

    .line 488
    :catchall_0
    move-exception p1

    .line 489
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 490
    .line 491
    .line 492
    throw p1

    .line 493
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
