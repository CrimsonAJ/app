.class public final synthetic LG/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, LG/j;->a:I

    iput-object p3, p0, LG/j;->c:Ljava/lang/Object;

    iput p1, p0, LG/j;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, LG/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LG/j;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lj3/b;

    .line 9
    .line 10
    iget-object v0, v0, Lj3/b;->b:Lj3/c;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    const/4 v2, 0x1

    .line 17
    iget v3, p0, LG/j;->b:I

    .line 18
    .line 19
    const/4 v4, -0x3

    .line 20
    const/4 v5, -0x2

    .line 21
    if-eq v3, v4, :cond_4

    .line 22
    .line 23
    if-eq v3, v5, :cond_4

    .line 24
    .line 25
    const/4 v4, -0x1

    .line 26
    if-eq v3, v4, :cond_1

    .line 27
    .line 28
    if-eq v3, v2, :cond_0

    .line 29
    .line 30
    const-string v0, "Unknown focus change type: "

    .line 31
    .line 32
    const-string v1, "AudioFocusManager"

    .line 33
    .line 34
    invoke-static {v0, v3, v1}, Lcom/google/android/gms/internal/measurement/k1;->v(Ljava/lang/String;ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-virtual {v0, v2}, Lj3/c;->b(I)V

    .line 39
    .line 40
    .line 41
    iget-object v0, v0, Lj3/c;->c:Lj3/A;

    .line 42
    .line 43
    if-eqz v0, :cond_8

    .line 44
    .line 45
    iget-object v0, v0, Lj3/A;->a:Lj3/D;

    .line 46
    .line 47
    invoke-virtual {v0}, Lj3/D;->m()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-virtual {v0, v2, v2, v1}, Lj3/D;->J0(IIZ)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    iget-object v3, v0, Lj3/c;->c:Lj3/A;

    .line 56
    .line 57
    if-eqz v3, :cond_3

    .line 58
    .line 59
    iget-object v3, v3, Lj3/A;->a:Lj3/D;

    .line 60
    .line 61
    invoke-virtual {v3}, Lj3/D;->m()Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_2

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    move v1, v2

    .line 69
    :goto_0
    invoke-virtual {v3, v4, v1, v5}, Lj3/D;->J0(IIZ)V

    .line 70
    .line 71
    .line 72
    :cond_3
    invoke-virtual {v0}, Lj3/c;->a()V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    if-eq v3, v5, :cond_5

    .line 77
    .line 78
    const/4 v1, 0x3

    .line 79
    invoke-virtual {v0, v1}, Lj3/c;->b(I)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_5
    iget-object v3, v0, Lj3/c;->c:Lj3/A;

    .line 84
    .line 85
    if-eqz v3, :cond_7

    .line 86
    .line 87
    iget-object v3, v3, Lj3/A;->a:Lj3/D;

    .line 88
    .line 89
    invoke-virtual {v3}, Lj3/D;->m()Z

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-eqz v4, :cond_6

    .line 94
    .line 95
    move v2, v1

    .line 96
    :cond_6
    const/4 v5, 0x0

    .line 97
    invoke-virtual {v3, v5, v2, v4}, Lj3/D;->J0(IIZ)V

    .line 98
    .line 99
    .line 100
    :cond_7
    invoke-virtual {v0, v1}, Lj3/c;->b(I)V

    .line 101
    .line 102
    .line 103
    :cond_8
    :goto_1
    return-void

    .line 104
    :pswitch_0
    iget-object v0, p0, LG/j;->c:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 107
    .line 108
    iget-object v1, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    check-cast v1, Landroid/view/View;

    .line 115
    .line 116
    if-eqz v1, :cond_9

    .line 117
    .line 118
    const/4 v2, 0x0

    .line 119
    iget v3, p0, LG/j;->b:I

    .line 120
    .line 121
    invoke-virtual {v0, v1, v3, v2}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->z(Landroid/view/View;IZ)V

    .line 122
    .line 123
    .line 124
    :cond_9
    return-void

    .line 125
    :pswitch_1
    iget-object v0, p0, LG/j;->c:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v0, LG/b;

    .line 128
    .line 129
    iget v1, p0, LG/j;->b:I

    .line 130
    .line 131
    invoke-virtual {v0, v1}, LG/b;->h(I)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
