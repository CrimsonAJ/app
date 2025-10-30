.class public final synthetic Lcom/google/android/gms/internal/cast/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final b:I

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;I)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lcom/google/android/gms/internal/cast/s;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/cast/s;->d:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/android/gms/internal/cast/s;->c:Ljava/lang/Object;

    iput p3, p0, Lcom/google/android/gms/internal/cast/s;->b:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lcom/google/android/gms/internal/cast/s;->a:I

    iput-object p1, p0, Lcom/google/android/gms/internal/cast/s;->d:Ljava/lang/Object;

    iput p2, p0, Lcom/google/android/gms/internal/cast/s;->b:I

    iput-object p3, p0, Lcom/google/android/gms/internal/cast/s;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p4, p0, Lcom/google/android/gms/internal/cast/s;->a:I

    iput-object p1, p0, Lcom/google/android/gms/internal/cast/s;->c:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/android/gms/internal/cast/s;->d:Ljava/lang/Object;

    iput p3, p0, Lcom/google/android/gms/internal/cast/s;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/cast/s;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/internal/cast/Y;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/gms/internal/cast/s;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lcom/google/android/gms/internal/cast/O0;

    .line 8
    .line 9
    iget v2, p0, Lcom/google/android/gms/internal/cast/s;->b:I

    .line 10
    .line 11
    iget-object v3, v0, Lcom/google/android/gms/internal/cast/Y;->h:Lcom/google/android/gms/internal/cast/z;

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    monitor-enter v3

    .line 17
    :try_start_0
    new-instance v4, Lf5/i;

    .line 18
    .line 19
    invoke-direct {v4}, Lf5/i;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-static {}, LD4/n;->g()LD4/n;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    new-instance v6, Lcom/google/android/gms/internal/cast/w0;

    .line 27
    .line 28
    iget-object v7, v3, Lcom/google/android/gms/internal/cast/z;->c:Lcom/google/android/gms/internal/cast/L;

    .line 29
    .line 30
    invoke-direct {v6, v7}, Lcom/google/android/gms/internal/cast/w0;-><init>(Lcom/google/android/gms/internal/cast/L;)V

    .line 31
    .line 32
    .line 33
    iput-object v6, v5, LD4/n;->e:Ljava/lang/Object;

    .line 34
    .line 35
    const/16 v6, 0x1195

    .line 36
    .line 37
    iput v6, v5, LD4/n;->d:I

    .line 38
    .line 39
    invoke-virtual {v5}, LD4/n;->f()LD4/n;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    const/4 v6, 0x0

    .line 44
    invoke-virtual {v7, v6, v5}, LC4/j;->c(ILD4/n;)Lf5/q;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    new-instance v6, Lcom/google/android/gms/internal/cast/x;

    .line 49
    .line 50
    invoke-direct {v6, v4}, Lcom/google/android/gms/internal/cast/x;-><init>(Lf5/i;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    sget-object v7, Lf5/j;->a:LD4/q;

    .line 57
    .line 58
    invoke-virtual {v5, v7, v6}, Lf5/q;->d(Ljava/util/concurrent/Executor;Lf5/e;)Lf5/q;

    .line 59
    .line 60
    .line 61
    new-instance v6, Lcom/google/android/gms/internal/cast/x;

    .line 62
    .line 63
    invoke-direct {v6, v4}, Lcom/google/android/gms/internal/cast/x;-><init>(Lf5/i;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v5, v7, v6}, Lf5/q;->c(Ljava/util/concurrent/Executor;Lf5/d;)Lf5/q;

    .line 67
    .line 68
    .line 69
    new-instance v5, Lcom/google/android/gms/internal/cast/y;

    .line 70
    .line 71
    const/4 v6, 0x0

    .line 72
    invoke-direct {v5, v6, v4}, Lcom/google/android/gms/internal/cast/y;-><init>(ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-wide v8, v3, Lcom/google/android/gms/internal/cast/z;->a:J

    .line 76
    .line 77
    const-wide/16 v10, 0x3e8

    .line 78
    .line 79
    mul-long/2addr v8, v10

    .line 80
    iget-object v6, v3, Lcom/google/android/gms/internal/cast/z;->b:LT4/d;

    .line 81
    .line 82
    invoke-virtual {v6, v5, v8, v9}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 83
    .line 84
    .line 85
    iget-object v4, v4, Lf5/i;->a:Lf5/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    .line 87
    monitor-exit v3

    .line 88
    new-instance v3, LA3/E;

    .line 89
    .line 90
    const/16 v5, 0xb

    .line 91
    .line 92
    invoke-direct {v3, v0, v1, v2, v5}, LA3/E;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4, v7, v3}, Lf5/q;->d(Ljava/util/concurrent/Executor;Lf5/e;)Lf5/q;

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :catchall_0
    move-exception v0

    .line 103
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    throw v0
    .line 105
    .line 106
    .line 107
    .line 108
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/cast/s;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/cast/s;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/graphics/Typeface;

    .line 9
    .line 10
    iget v1, p0, Lcom/google/android/gms/internal/cast/s;->b:I

    .line 11
    .line 12
    iget-object v2, p0, Lcom/google/android/gms/internal/cast/s;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Landroid/widget/TextView;

    .line 15
    .line 16
    invoke-virtual {v2, v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cast/s;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 23
    .line 24
    iget-object v1, p0, Lcom/google/android/gms/internal/cast/s;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Landroid/view/View;

    .line 27
    .line 28
    iget v2, p0, Lcom/google/android/gms/internal/cast/s;->b:I

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L(Landroid/view/View;IZ)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_1
    iget-object v0, p0, Lcom/google/android/gms/internal/cast/s;->d:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Landroidx/work/impl/foreground/SystemForegroundService;

    .line 38
    .line 39
    iget-object v0, v0, Landroidx/work/impl/foreground/SystemForegroundService;->e:Landroid/app/NotificationManager;

    .line 40
    .line 41
    iget v1, p0, Lcom/google/android/gms/internal/cast/s;->b:I

    .line 42
    .line 43
    iget-object v2, p0, Lcom/google/android/gms/internal/cast/s;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v2, Landroid/app/Notification;

    .line 46
    .line 47
    invoke-virtual {v0, v1, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_2
    iget-object v0, p0, Lcom/google/android/gms/internal/cast/s;->d:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Landroid/content/Intent;

    .line 54
    .line 55
    iget v1, p0, Lcom/google/android/gms/internal/cast/s;->b:I

    .line 56
    .line 57
    iget-object v2, p0, Lcom/google/android/gms/internal/cast/s;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, Lh1/g;

    .line 60
    .line 61
    invoke-virtual {v2, v0, v1}, Lh1/g;->b(Landroid/content/Intent;I)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_3
    new-instance v0, Landroid/content/Intent;

    .line 66
    .line 67
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 68
    .line 69
    .line 70
    const-string v1, "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-string v1, "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION"

    .line 77
    .line 78
    iget-object v2, p0, Lcom/google/android/gms/internal/cast/s;->c:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v2, Landroid/content/IntentSender$SendIntentException;

    .line 81
    .line 82
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iget-object v1, p0, Lcom/google/android/gms/internal/cast/s;->d:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v1, Ld/f;

    .line 89
    .line 90
    iget v2, p0, Lcom/google/android/gms/internal/cast/s;->b:I

    .line 91
    .line 92
    const/4 v3, 0x0

    .line 93
    invoke-virtual {v1, v2, v3, v0}, Ld/f;->a(IILandroid/content/Intent;)Z

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_4
    iget-object v0, p0, Lcom/google/android/gms/internal/cast/s;->c:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, Lcom/google/firebase/messaging/u;

    .line 100
    .line 101
    iget-object v0, v0, Lcom/google/firebase/messaging/u;->a:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, Ljava/io/Serializable;

    .line 104
    .line 105
    iget-object v1, p0, Lcom/google/android/gms/internal/cast/s;->d:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v1, Ld/f;

    .line 108
    .line 109
    iget-object v2, v1, Ld/f;->a:Ljava/util/HashMap;

    .line 110
    .line 111
    iget v3, p0, Lcom/google/android/gms/internal/cast/s;->b:I

    .line 112
    .line 113
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    check-cast v2, Ljava/lang/String;

    .line 122
    .line 123
    if-nez v2, :cond_0

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_0
    iget-object v3, v1, Ld/f;->e:Ljava/util/HashMap;

    .line 127
    .line 128
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    check-cast v3, Lf/f;

    .line 133
    .line 134
    if-eqz v3, :cond_1

    .line 135
    .line 136
    iget-object v3, v3, Lf/f;->a:Lf/b;

    .line 137
    .line 138
    iget-object v1, v1, Ld/f;->d:Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-eqz v1, :cond_2

    .line 145
    .line 146
    invoke-interface {v3, v0}, Lf/b;->d(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_1
    iget-object v3, v1, Ld/f;->g:Landroid/os/Bundle;

    .line 151
    .line 152
    invoke-virtual {v3, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    iget-object v1, v1, Ld/f;->f:Ljava/util/HashMap;

    .line 156
    .line 157
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    :cond_2
    :goto_0
    return-void

    .line 161
    :pswitch_5
    invoke-direct {p0}, Lcom/google/android/gms/internal/cast/s;->a()V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :pswitch_6
    iget-object v0, p0, Lcom/google/android/gms/internal/cast/s;->c:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v0, Lcom/google/android/gms/internal/cast/t;

    .line 168
    .line 169
    iget-object v1, p0, Lcom/google/android/gms/internal/cast/s;->d:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v1, Lt0/w;

    .line 172
    .line 173
    iget v2, p0, Lcom/google/android/gms/internal/cast/s;->b:I

    .line 174
    .line 175
    iget-object v3, v0, Lcom/google/android/gms/internal/cast/t;->i:Ljava/util/HashMap;

    .line 176
    .line 177
    monitor-enter v3

    .line 178
    :try_start_0
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/cast/t;->j1(Lt0/w;I)V

    .line 179
    .line 180
    .line 181
    monitor-exit v3

    .line 182
    return-void

    .line 183
    :catchall_0
    move-exception v0

    .line 184
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 185
    throw v0

    .line 186
    nop

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
