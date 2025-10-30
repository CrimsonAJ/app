.class public final Lcom/anilab/android/App;
.super LI1/m;
.source "SourceFile"


# static fields
.field public static h:Lco/notix/interstitial/InterstitialLoader;

.field public static final i:Ljava/util/concurrent/atomic/AtomicBoolean;


# instance fields
.field public c:LL2/b;

.field public d:LL2/a;

.field public e:LL2/z;

.field public f:LL2/y;

.field public final g:Ld8/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/anilab/android/App;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    return-void
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

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, LI1/m;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ld8/e;

    .line 5
    .line 6
    invoke-static {}, LY7/B;->b()LY7/z0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    sget-object v2, LY7/K;->a:Lf8/e;

    .line 11
    .line 12
    sget-object v2, Ld8/o;->a:LZ7/d;

    .line 13
    .line 14
    invoke-static {v1, v2}, LO4/h;->D(LE7/g;LE7/i;)LE7/i;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-direct {v0, v1}, Ld8/e;-><init>(LE7/i;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/anilab/android/App;->g:Ld8/e;

    .line 22
    .line 23
    return-void
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


# virtual methods
.method public final onCreate()V
    .locals 6

    .line 1
    invoke-super {p0}, LI1/m;->onCreate()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1a

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    const v0, 0x7f140071

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "getString(...)"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const v2, 0x7f140070

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v2, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lcom/google/firebase/messaging/e;->C()V

    .line 33
    .line 34
    .line 35
    const v1, 0x7f140072

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v1, v0}, Lcom/google/firebase/messaging/e;->e(Ljava/lang/String;Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0, v2}, Lcom/google/firebase/messaging/e;->r(Landroid/app/NotificationChannel;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const-string v1, "notification"

    .line 50
    .line 51
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    const-string v2, "null cannot be cast to non-null type android.app.NotificationManager"

    .line 56
    .line 57
    invoke-static {v1, v2}, Lkotlin/jvm/internal/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    check-cast v1, Landroid/app/NotificationManager;

    .line 61
    .line 62
    invoke-static {v1, v0}, LB4/e;->t(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 63
    .line 64
    .line 65
    :cond_0
    :try_start_0
    invoke-static {p0}, Lu4/b;->a(Landroid/content/Context;)Lu4/b;

    .line 66
    .line 67
    .line 68
    sget-object v0, Lcom/anilab/android/App;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 69
    .line 70
    const/4 v1, 0x0

    .line 71
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :catch_0
    sget-object v0, Lcom/anilab/android/App;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 76
    .line 77
    const/4 v1, 0x1

    .line 78
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 79
    .line 80
    .line 81
    :goto_0
    :try_start_1
    invoke-static {}, Ls8/e;->D()Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    const-string v1, "1.1.2"

    .line 86
    .line 87
    new-instance v2, LC3/v;

    .line 88
    .line 89
    const/16 v3, 0x12

    .line 90
    .line 91
    invoke-direct {v2, v3, v1}, LC3/v;-><init>(ILjava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    iget-object v0, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->h:Lf5/q;

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    sget-object v1, Lf5/j;->a:LD4/q;

    .line 100
    .line 101
    new-instance v3, Lf5/q;

    .line 102
    .line 103
    invoke-direct {v3}, Lf5/q;-><init>()V

    .line 104
    .line 105
    .line 106
    new-instance v4, Lf5/m;

    .line 107
    .line 108
    invoke-direct {v4, v1, v2, v3}, Lf5/m;-><init>(Ljava/util/concurrent/Executor;Lf5/g;Lf5/q;)V

    .line 109
    .line 110
    .line 111
    iget-object v2, v0, Lf5/q;->b:Lcom/google/android/gms/internal/measurement/C1;

    .line 112
    .line 113
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/measurement/C1;->f(Lf5/n;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Lf5/q;->s()V

    .line 117
    .line 118
    .line 119
    invoke-static {}, Ls8/e;->D()Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    const-string v2, "com.anilab.android"

    .line 124
    .line 125
    new-instance v3, LC3/v;

    .line 126
    .line 127
    const/16 v4, 0x12

    .line 128
    .line 129
    invoke-direct {v3, v4, v2}, LC3/v;-><init>(ILjava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    iget-object v0, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->h:Lf5/q;

    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    new-instance v2, Lf5/q;

    .line 138
    .line 139
    invoke-direct {v2}, Lf5/q;-><init>()V

    .line 140
    .line 141
    .line 142
    new-instance v4, Lf5/m;

    .line 143
    .line 144
    invoke-direct {v4, v1, v3, v2}, Lf5/m;-><init>(Ljava/util/concurrent/Executor;Lf5/g;Lf5/q;)V

    .line 145
    .line 146
    .line 147
    iget-object v1, v0, Lf5/q;->b:Lcom/google/android/gms/internal/measurement/C1;

    .line 148
    .line 149
    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/measurement/C1;->f(Lf5/n;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0}, Lf5/q;->s()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 153
    .line 154
    .line 155
    :catch_1
    :try_start_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/D1;->v()Lc7/e;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    new-instance v1, Lc7/j;

    .line 160
    .line 161
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 162
    .line 163
    .line 164
    sget-wide v2, Ld7/i;->i:J

    .line 165
    .line 166
    iput-wide v2, v1, Lc7/j;->a:J

    .line 167
    .line 168
    sget-object v2, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    .line 169
    .line 170
    const-wide/16 v3, 0x2

    .line 171
    .line 172
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    .line 173
    .line 174
    .line 175
    move-result-wide v2

    .line 176
    const-wide/16 v4, 0x0

    .line 177
    .line 178
    cmp-long v4, v2, v4

    .line 179
    .line 180
    if-ltz v4, :cond_1

    .line 181
    .line 182
    iput-wide v2, v1, Lc7/j;->a:J

    .line 183
    .line 184
    new-instance v2, Lc7/j;

    .line 185
    .line 186
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 187
    .line 188
    .line 189
    iget-wide v3, v1, Lc7/j;->a:J

    .line 190
    .line 191
    iput-wide v3, v2, Lc7/j;->a:J

    .line 192
    .line 193
    new-instance v1, Lc7/c;

    .line 194
    .line 195
    const/4 v3, 0x0

    .line 196
    invoke-direct {v1, v0, v3, v2}, Lc7/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    iget-object v0, v0, Lc7/e;->b:Ljava/util/concurrent/Executor;

    .line 200
    .line 201
    invoke-static {v0, v1}, Ls8/n;->e(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lf5/q;

    .line 202
    .line 203
    .line 204
    invoke-static {}, Lcom/google/android/gms/internal/measurement/D1;->v()Lc7/e;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    new-instance v1, LI1/c;

    .line 209
    .line 210
    const/4 v2, 0x0

    .line 211
    invoke-direct {v1, v2, p0}, LI1/c;-><init>(ILjava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    iget-object v0, v0, Lc7/e;->h:LO0/c;

    .line 215
    .line 216
    monitor-enter v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 217
    :try_start_3
    iget-object v2, v0, LO0/c;->b:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v2, Ljava/util/LinkedHashSet;

    .line 220
    .line 221
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0}, LO0/c;->f()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 225
    .line 226
    .line 227
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 228
    goto :goto_1

    .line 229
    :catchall_0
    move-exception v1

    .line 230
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 231
    :try_start_6
    throw v1

    .line 232
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 233
    .line 234
    new-instance v1, Ljava/lang/StringBuilder;

    .line 235
    .line 236
    const-string v4, "Minimum interval between fetches has to be a non-negative number. "

    .line 237
    .line 238
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    const-string v2, " is an invalid argument"

    .line 245
    .line 246
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    throw v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    .line 257
    :catch_2
    :goto_1
    :try_start_7
    sget-object v0, Lco/notix/interstitial/NotixInterstitial;->Companion:Lco/notix/interstitial/NotixInterstitial$Companion;

    .line 258
    .line 259
    iget-object v1, p0, Lcom/anilab/android/App;->f:LL2/y;

    .line 260
    .line 261
    if-eqz v1, :cond_2

    .line 262
    .line 263
    invoke-virtual {v1}, LL2/y;->a()LH2/r;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    iget-object v1, v1, LH2/r;->a:Ljava/lang/Long;

    .line 268
    .line 269
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 270
    .line 271
    .line 272
    move-result-wide v1

    .line 273
    invoke-virtual {v0, v1, v2}, Lco/notix/interstitial/NotixInterstitial$Companion;->createLoader(J)Lco/notix/interstitial/InterstitialLoader;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    const-string v1, "<set-?>"

    .line 278
    .line 279
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    sput-object v0, Lcom/anilab/android/App;->h:Lco/notix/interstitial/InterstitialLoader;

    .line 283
    .line 284
    invoke-interface {v0}, Lco/notix/interstitial/InterstitialLoader;->startLoading()V

    .line 285
    .line 286
    .line 287
    sget-object v0, Lco/notix/Notix;->Companion:Lco/notix/Notix$Companion;

    .line 288
    .line 289
    sget-object v1, Lco/notix/log/LogLevel;->NONE:Lco/notix/log/LogLevel;

    .line 290
    .line 291
    invoke-virtual {v0, v1}, Lco/notix/Notix$Companion;->setLogLevel(Lco/notix/log/LogLevel;)V

    .line 292
    .line 293
    .line 294
    goto :goto_2

    .line 295
    :cond_2
    const-string v0, "n"

    .line 296
    .line 297
    invoke-static {v0}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    const/4 v0, 0x0

    .line 301
    throw v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    .line 302
    :catch_3
    :goto_2
    return-void
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
