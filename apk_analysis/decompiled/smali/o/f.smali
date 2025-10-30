.class public final Lo/f;
.super Lo/t;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:I

.field public final d:I

.field public final e:Z

.field public final f:Landroid/os/Handler;

.field public final g:Ljava/util/ArrayList;

.field public final h:Ljava/util/ArrayList;

.field public final i:Lo/d;

.field public final j:LK5/o;

.field public final k:Lf5/o;

.field public l:I

.field public m:I

.field public n:Landroid/view/View;

.field public o:Landroid/view/View;

.field public p:I

.field public q:Z

.field public r:Z

.field public s:I

.field public t:I

.field public u:Z

.field public v:Z

.field public w:Lo/w;

.field public x:Landroid/view/ViewTreeObserver;

.field public y:Lo/u;

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;IZ)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lo/f;->g:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lo/f;->h:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Lo/d;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v0, v1, p0}, Lo/d;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lo/f;->i:Lo/d;

    .line 25
    .line 26
    new-instance v0, LK5/o;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    invoke-direct {v0, v1, p0}, LK5/o;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lo/f;->j:LK5/o;

    .line 33
    .line 34
    new-instance v0, Lf5/o;

    .line 35
    .line 36
    const/16 v1, 0xb

    .line 37
    .line 38
    invoke-direct {v0, v1, p0}, Lf5/o;-><init>(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lo/f;->k:Lf5/o;

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    iput v0, p0, Lo/f;->l:I

    .line 45
    .line 46
    iput v0, p0, Lo/f;->m:I

    .line 47
    .line 48
    iput-object p1, p0, Lo/f;->b:Landroid/content/Context;

    .line 49
    .line 50
    iput-object p2, p0, Lo/f;->n:Landroid/view/View;

    .line 51
    .line 52
    iput p3, p0, Lo/f;->d:I

    .line 53
    .line 54
    iput-boolean p4, p0, Lo/f;->e:Z

    .line 55
    .line 56
    iput-boolean v0, p0, Lo/f;->u:Z

    .line 57
    .line 58
    invoke-virtual {p2}, Landroid/view/View;->getLayoutDirection()I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    const/4 p3, 0x1

    .line 63
    if-ne p2, p3, :cond_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    move v0, p3

    .line 67
    :goto_0
    iput v0, p0, Lo/f;->p:I

    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    iget p2, p2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 78
    .line 79
    div-int/lit8 p2, p2, 0x2

    .line 80
    .line 81
    const p3, 0x7f070017

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    iput p1, p0, Lo/f;->c:I

    .line 93
    .line 94
    new-instance p1, Landroid/os/Handler;

    .line 95
    .line 96
    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 97
    .line 98
    .line 99
    iput-object p1, p0, Lo/f;->f:Landroid/os/Handler;

    .line 100
    .line 101
    return-void
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
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
.end method


# virtual methods
.method public final a()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lo/f;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-lez v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lo/e;

    .line 15
    .line 16
    iget-object v0, v0, Lo/e;->a:Lp/F0;

    .line 17
    .line 18
    iget-object v0, v0, Lp/A0;->z:Lp/x;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    return v0

    .line 28
    :cond_0
    return v2
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final b(Landroid/os/Parcelable;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
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
.end method

.method public final c(Lo/l;Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Lo/f;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Lo/e;

    .line 16
    .line 17
    iget-object v4, v4, Lo/e;->b:Lo/l;

    .line 18
    .line 19
    if-ne p1, v4, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v3, -0x1

    .line 26
    :goto_1
    if-gez v3, :cond_2

    .line 27
    .line 28
    goto/16 :goto_4

    .line 29
    .line 30
    :cond_2
    add-int/lit8 v1, v3, 0x1

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-ge v1, v4, :cond_3

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Lo/e;

    .line 43
    .line 44
    iget-object v1, v1, Lo/e;->b:Lo/l;

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Lo/l;->c(Z)V

    .line 47
    .line 48
    .line 49
    :cond_3
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Lo/e;

    .line 54
    .line 55
    iget-object v3, v1, Lo/e;->b:Lo/l;

    .line 56
    .line 57
    invoke-virtual {v3, p0}, Lo/l;->r(Lo/x;)V

    .line 58
    .line 59
    .line 60
    iget-boolean v3, p0, Lo/f;->z:Z

    .line 61
    .line 62
    iget-object v1, v1, Lo/e;->a:Lp/F0;

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    if-eqz v3, :cond_4

    .line 66
    .line 67
    iget-object v3, v1, Lp/A0;->z:Lp/x;

    .line 68
    .line 69
    invoke-static {v3, v4}, Lp/C0;->b(Landroid/widget/PopupWindow;Landroid/transition/Transition;)V

    .line 70
    .line 71
    .line 72
    iget-object v3, v1, Lp/A0;->z:Lp/x;

    .line 73
    .line 74
    invoke-virtual {v3, v2}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 75
    .line 76
    .line 77
    :cond_4
    invoke-virtual {v1}, Lp/A0;->dismiss()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    const/4 v3, 0x1

    .line 85
    if-lez v1, :cond_5

    .line 86
    .line 87
    add-int/lit8 v5, v1, -0x1

    .line 88
    .line 89
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    check-cast v5, Lo/e;

    .line 94
    .line 95
    iget v5, v5, Lo/e;->c:I

    .line 96
    .line 97
    iput v5, p0, Lo/f;->p:I

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_5
    iget-object v5, p0, Lo/f;->n:Landroid/view/View;

    .line 101
    .line 102
    invoke-virtual {v5}, Landroid/view/View;->getLayoutDirection()I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-ne v5, v3, :cond_6

    .line 107
    .line 108
    move v5, v2

    .line 109
    goto :goto_2

    .line 110
    :cond_6
    move v5, v3

    .line 111
    :goto_2
    iput v5, p0, Lo/f;->p:I

    .line 112
    .line 113
    :goto_3
    if-nez v1, :cond_a

    .line 114
    .line 115
    invoke-virtual {p0}, Lo/f;->dismiss()V

    .line 116
    .line 117
    .line 118
    iget-object p2, p0, Lo/f;->w:Lo/w;

    .line 119
    .line 120
    if-eqz p2, :cond_7

    .line 121
    .line 122
    invoke-interface {p2, p1, v3}, Lo/w;->c(Lo/l;Z)V

    .line 123
    .line 124
    .line 125
    :cond_7
    iget-object p1, p0, Lo/f;->x:Landroid/view/ViewTreeObserver;

    .line 126
    .line 127
    if-eqz p1, :cond_9

    .line 128
    .line 129
    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    if-eqz p1, :cond_8

    .line 134
    .line 135
    iget-object p1, p0, Lo/f;->x:Landroid/view/ViewTreeObserver;

    .line 136
    .line 137
    iget-object p2, p0, Lo/f;->i:Lo/d;

    .line 138
    .line 139
    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 140
    .line 141
    .line 142
    :cond_8
    iput-object v4, p0, Lo/f;->x:Landroid/view/ViewTreeObserver;

    .line 143
    .line 144
    :cond_9
    iget-object p1, p0, Lo/f;->o:Landroid/view/View;

    .line 145
    .line 146
    iget-object p2, p0, Lo/f;->j:LK5/o;

    .line 147
    .line 148
    invoke-virtual {p1, p2}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 149
    .line 150
    .line 151
    iget-object p1, p0, Lo/f;->y:Lo/u;

    .line 152
    .line 153
    invoke-virtual {p1}, Lo/u;->onDismiss()V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :cond_a
    if-eqz p2, :cond_b

    .line 158
    .line 159
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    check-cast p1, Lo/e;

    .line 164
    .line 165
    iget-object p1, p1, Lo/e;->b:Lo/l;

    .line 166
    .line 167
    invoke-virtual {p1, v2}, Lo/l;->c(Z)V

    .line 168
    .line 169
    .line 170
    :cond_b
    :goto_4
    return-void
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
.end method

.method public final d()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lo/f;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Lo/f;->g:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    :goto_0
    if-ge v3, v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    check-cast v4, Lo/l;

    .line 25
    .line 26
    invoke-virtual {p0, v4}, Lo/f;->x(Lo/l;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lo/f;->n:Landroid/view/View;

    .line 34
    .line 35
    iput-object v0, p0, Lo/f;->o:Landroid/view/View;

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    iget-object v1, p0, Lo/f;->x:Landroid/view/ViewTreeObserver;

    .line 40
    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    const/4 v2, 0x1

    .line 44
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Lo/f;->x:Landroid/view/ViewTreeObserver;

    .line 49
    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    iget-object v1, p0, Lo/f;->i:Lo/d;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 55
    .line 56
    .line 57
    :cond_3
    iget-object v0, p0, Lo/f;->o:Landroid/view/View;

    .line 58
    .line 59
    iget-object v1, p0, Lo/f;->j:LK5/o;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 62
    .line 63
    .line 64
    :cond_4
    :goto_1
    return-void
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method

.method public final dismiss()V
    .locals 4

    .line 1
    iget-object v0, p0, Lo/f;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-lez v1, :cond_1

    .line 8
    .line 9
    new-array v2, v1, [Lo/e;

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, [Lo/e;

    .line 16
    .line 17
    add-int/lit8 v1, v1, -0x1

    .line 18
    .line 19
    :goto_0
    if-ltz v1, :cond_1

    .line 20
    .line 21
    aget-object v2, v0, v1

    .line 22
    .line 23
    iget-object v3, v2, Lo/e;->a:Lp/F0;

    .line 24
    .line 25
    iget-object v3, v3, Lp/A0;->z:Lp/x;

    .line 26
    .line 27
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    iget-object v2, v2, Lo/e;->a:Lp/F0;

    .line 34
    .line 35
    invoke-virtual {v2}, Lp/A0;->dismiss()V

    .line 36
    .line 37
    .line 38
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-void
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
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method

.method public final e()Lp/o0;
    .locals 2

    .line 1
    iget-object v0, p0, Lo/f;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/lit8 v1, v1, -0x1

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lo/e;

    .line 22
    .line 23
    iget-object v0, v0, Lo/e;->a:Lp/F0;

    .line 24
    .line 25
    iget-object v0, v0, Lp/A0;->c:Lp/o0;

    .line 26
    .line 27
    return-object v0
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final f(Z)V
    .locals 4

    .line 1
    iget-object p1, p0, Lo/f;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    add-int/lit8 v1, v1, 0x1

    .line 15
    .line 16
    check-cast v2, Lo/e;

    .line 17
    .line 18
    iget-object v2, v2, Lo/e;->a:Lp/F0;

    .line 19
    .line 20
    iget-object v2, v2, Lp/A0;->c:Lp/o0;

    .line 21
    .line 22
    invoke-virtual {v2}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    instance-of v3, v2, Landroid/widget/HeaderViewListAdapter;

    .line 27
    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    check-cast v2, Landroid/widget/HeaderViewListAdapter;

    .line 31
    .line 32
    invoke-virtual {v2}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Lo/i;

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    check-cast v2, Lo/i;

    .line 40
    .line 41
    :goto_1
    invoke-virtual {v2}, Lo/i;->notifyDataSetChanged()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    return-void
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method public final h(Lo/w;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo/f;->w:Lo/w;

    .line 2
    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
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
.end method

.method public final j()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
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
.end method

.method public final k()Landroid/os/Parcelable;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
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
.end method

.method public final l(Lo/D;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lo/f;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :cond_0
    const/4 v4, 0x1

    .line 10
    if-ge v3, v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    add-int/lit8 v3, v3, 0x1

    .line 17
    .line 18
    check-cast v5, Lo/e;

    .line 19
    .line 20
    iget-object v6, v5, Lo/e;->b:Lo/l;

    .line 21
    .line 22
    if-ne p1, v6, :cond_0

    .line 23
    .line 24
    iget-object p1, v5, Lo/e;->a:Lp/F0;

    .line 25
    .line 26
    iget-object p1, p1, Lp/A0;->c:Lp/o0;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 29
    .line 30
    .line 31
    return v4

    .line 32
    :cond_1
    invoke-virtual {p1}, Lo/l;->hasVisibleItems()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lo/f;->n(Lo/l;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lo/f;->w:Lo/w;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-interface {v0, p1}, Lo/w;->m(Lo/l;)Z

    .line 46
    .line 47
    .line 48
    :cond_2
    return v4

    .line 49
    :cond_3
    return v2
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method public final n(Lo/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo/f;->b:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p1, p0, v0}, Lo/l;->b(Lo/x;Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lo/f;->a()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lo/f;->x(Lo/l;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v0, p0, Lo/f;->g:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    return-void
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

.method public final onDismiss()V
    .locals 6

    .line 1
    iget-object v0, p0, Lo/f;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Lo/e;

    .line 16
    .line 17
    iget-object v5, v4, Lo/e;->a:Lp/F0;

    .line 18
    .line 19
    iget-object v5, v5, Lp/A0;->z:Lp/x;

    .line 20
    .line 21
    invoke-virtual {v5}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-nez v5, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v4, 0x0

    .line 32
    :goto_1
    if-eqz v4, :cond_2

    .line 33
    .line 34
    iget-object v0, v4, Lo/e;->b:Lo/l;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Lo/l;->c(Z)V

    .line 37
    .line 38
    .line 39
    :cond_2
    return-void
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
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method

.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p3, 0x1

    .line 6
    if-ne p1, p3, :cond_0

    .line 7
    .line 8
    const/16 p1, 0x52

    .line 9
    .line 10
    if-ne p2, p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lo/f;->dismiss()V

    .line 13
    .line 14
    .line 15
    return p3

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
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
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
.end method

.method public final p(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo/f;->n:Landroid/view/View;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lo/f;->n:Landroid/view/View;

    .line 6
    .line 7
    iget v0, p0, Lo/f;->l:I

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {v0, p1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iput p1, p0, Lo/f;->m:I

    .line 18
    .line 19
    :cond_0
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final q(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lo/f;->u:Z

    .line 2
    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
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
.end method

.method public final r(I)V
    .locals 1

    .line 1
    iget v0, p0, Lo/f;->l:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lo/f;->l:I

    .line 6
    .line 7
    iget-object v0, p0, Lo/f;->n:Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {p1, v0}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iput p1, p0, Lo/f;->m:I

    .line 18
    .line 19
    :cond_0
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final s(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lo/f;->q:Z

    .line 3
    .line 4
    iput p1, p0, Lo/f;->s:I

    .line 5
    .line 6
    return-void
    .line 7
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
.end method

.method public final t(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    .line 1
    check-cast p1, Lo/u;

    .line 2
    .line 3
    iput-object p1, p0, Lo/f;->y:Lo/u;

    .line 4
    .line 5
    return-void
    .line 6
    .line 7
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
.end method

.method public final u(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lo/f;->v:Z

    .line 2
    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
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
.end method

.method public final v(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lo/f;->r:Z

    .line 3
    .line 4
    iput p1, p0, Lo/f;->t:I

    .line 5
    .line 6
    return-void
    .line 7
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
.end method

.method public final x(Lo/l;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v3, v0, Lo/f;->b:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    new-instance v5, Lo/i;

    .line 12
    .line 13
    iget-boolean v6, v0, Lo/f;->e:Z

    .line 14
    .line 15
    const v7, 0x7f0d000b

    .line 16
    .line 17
    .line 18
    invoke-direct {v5, v1, v4, v6, v7}, Lo/i;-><init>(Lo/l;Landroid/view/LayoutInflater;ZI)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lo/f;->a()Z

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    const/4 v7, 0x1

    .line 26
    if-nez v6, :cond_0

    .line 27
    .line 28
    iget-boolean v6, v0, Lo/f;->u:Z

    .line 29
    .line 30
    if-eqz v6, :cond_0

    .line 31
    .line 32
    iput-boolean v7, v5, Lo/i;->c:Z

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {v0}, Lo/f;->a()Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_1

    .line 40
    .line 41
    invoke-static {v1}, Lo/t;->w(Lo/l;)Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    iput-boolean v6, v5, Lo/i;->c:Z

    .line 46
    .line 47
    :cond_1
    :goto_0
    iget v6, v0, Lo/f;->c:I

    .line 48
    .line 49
    invoke-static {v5, v3, v6}, Lo/t;->o(Landroid/widget/ListAdapter;Landroid/content/Context;I)I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    new-instance v8, Lp/F0;

    .line 54
    .line 55
    iget v9, v0, Lo/f;->d:I

    .line 56
    .line 57
    const/4 v10, 0x0

    .line 58
    invoke-direct {v8, v3, v10, v9}, Lp/A0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 59
    .line 60
    .line 61
    iget-object v3, v8, Lp/A0;->z:Lp/x;

    .line 62
    .line 63
    iget-object v9, v0, Lo/f;->k:Lf5/o;

    .line 64
    .line 65
    iput-object v9, v8, Lp/F0;->D:Lf5/o;

    .line 66
    .line 67
    iput-object v0, v8, Lp/A0;->p:Landroid/widget/AdapterView$OnItemClickListener;

    .line 68
    .line 69
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 70
    .line 71
    .line 72
    iget-object v9, v0, Lo/f;->n:Landroid/view/View;

    .line 73
    .line 74
    iput-object v9, v8, Lp/A0;->o:Landroid/view/View;

    .line 75
    .line 76
    iget v9, v0, Lo/f;->m:I

    .line 77
    .line 78
    iput v9, v8, Lp/A0;->l:I

    .line 79
    .line 80
    iput-boolean v7, v8, Lp/A0;->y:Z

    .line 81
    .line 82
    invoke-virtual {v3, v7}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 83
    .line 84
    .line 85
    const/4 v9, 0x2

    .line 86
    invoke-virtual {v3, v9}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v8, v5}, Lp/A0;->p(Landroid/widget/ListAdapter;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v8, v6}, Lp/A0;->r(I)V

    .line 93
    .line 94
    .line 95
    iget v5, v0, Lo/f;->m:I

    .line 96
    .line 97
    iput v5, v8, Lp/A0;->l:I

    .line 98
    .line 99
    iget-object v5, v0, Lo/f;->h:Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    if-lez v11, :cond_b

    .line 106
    .line 107
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 108
    .line 109
    .line 110
    move-result v11

    .line 111
    sub-int/2addr v11, v7

    .line 112
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    check-cast v11, Lo/e;

    .line 117
    .line 118
    iget-object v12, v11, Lo/e;->b:Lo/l;

    .line 119
    .line 120
    iget-object v13, v12, Lo/l;->f:Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 123
    .line 124
    .line 125
    move-result v13

    .line 126
    const/4 v14, 0x0

    .line 127
    :goto_1
    if-ge v14, v13, :cond_3

    .line 128
    .line 129
    invoke-virtual {v12, v14}, Lo/l;->getItem(I)Landroid/view/MenuItem;

    .line 130
    .line 131
    .line 132
    move-result-object v15

    .line 133
    invoke-interface {v15}, Landroid/view/MenuItem;->hasSubMenu()Z

    .line 134
    .line 135
    .line 136
    move-result v16

    .line 137
    if-eqz v16, :cond_2

    .line 138
    .line 139
    invoke-interface {v15}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    if-ne v1, v9, :cond_2

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_2
    add-int/2addr v14, v7

    .line 147
    const/4 v9, 0x2

    .line 148
    goto :goto_1

    .line 149
    :cond_3
    move-object v15, v10

    .line 150
    :goto_2
    if-nez v15, :cond_4

    .line 151
    .line 152
    move/from16 v18, v7

    .line 153
    .line 154
    move-object v2, v10

    .line 155
    const/16 v17, 0x0

    .line 156
    .line 157
    goto :goto_7

    .line 158
    :cond_4
    iget-object v9, v11, Lo/e;->a:Lp/F0;

    .line 159
    .line 160
    iget-object v9, v9, Lp/A0;->c:Lp/o0;

    .line 161
    .line 162
    invoke-virtual {v9}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 163
    .line 164
    .line 165
    move-result-object v12

    .line 166
    instance-of v13, v12, Landroid/widget/HeaderViewListAdapter;

    .line 167
    .line 168
    if-eqz v13, :cond_5

    .line 169
    .line 170
    check-cast v12, Landroid/widget/HeaderViewListAdapter;

    .line 171
    .line 172
    invoke-virtual {v12}, Landroid/widget/HeaderViewListAdapter;->getHeadersCount()I

    .line 173
    .line 174
    .line 175
    move-result v13

    .line 176
    invoke-virtual {v12}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    .line 177
    .line 178
    .line 179
    move-result-object v12

    .line 180
    check-cast v12, Lo/i;

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_5
    check-cast v12, Lo/i;

    .line 184
    .line 185
    const/4 v13, 0x0

    .line 186
    :goto_3
    invoke-virtual {v12}, Lo/i;->getCount()I

    .line 187
    .line 188
    .line 189
    move-result v14

    .line 190
    const/4 v10, 0x0

    .line 191
    const/16 v17, 0x0

    .line 192
    .line 193
    :goto_4
    const/4 v2, -0x1

    .line 194
    move/from16 v18, v7

    .line 195
    .line 196
    if-ge v10, v14, :cond_7

    .line 197
    .line 198
    invoke-virtual {v12, v10}, Lo/i;->b(I)Lo/n;

    .line 199
    .line 200
    .line 201
    move-result-object v7

    .line 202
    if-ne v15, v7, :cond_6

    .line 203
    .line 204
    goto :goto_5

    .line 205
    :cond_6
    add-int/lit8 v10, v10, 0x1

    .line 206
    .line 207
    move/from16 v7, v18

    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_7
    move v10, v2

    .line 211
    :goto_5
    if-ne v10, v2, :cond_9

    .line 212
    .line 213
    :cond_8
    :goto_6
    const/4 v2, 0x0

    .line 214
    goto :goto_7

    .line 215
    :cond_9
    add-int/2addr v10, v13

    .line 216
    invoke-virtual {v9}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    sub-int/2addr v10, v2

    .line 221
    if-ltz v10, :cond_8

    .line 222
    .line 223
    invoke-virtual {v9}, Landroid/view/ViewGroup;->getChildCount()I

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    if-lt v10, v2, :cond_a

    .line 228
    .line 229
    goto :goto_6

    .line 230
    :cond_a
    invoke-virtual {v9, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    goto :goto_7

    .line 235
    :cond_b
    move/from16 v18, v7

    .line 236
    .line 237
    const/16 v17, 0x0

    .line 238
    .line 239
    const/4 v2, 0x0

    .line 240
    const/4 v11, 0x0

    .line 241
    :goto_7
    if-eqz v2, :cond_17

    .line 242
    .line 243
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 244
    .line 245
    const/16 v9, 0x1c

    .line 246
    .line 247
    if-gt v7, v9, :cond_d

    .line 248
    .line 249
    sget-object v7, Lp/F0;->X:Ljava/lang/reflect/Method;

    .line 250
    .line 251
    if-eqz v7, :cond_c

    .line 252
    .line 253
    move/from16 v9, v18

    .line 254
    .line 255
    :try_start_0
    new-array v10, v9, [Ljava/lang/Object;

    .line 256
    .line 257
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 258
    .line 259
    aput-object v9, v10, v17

    .line 260
    .line 261
    invoke-virtual {v7, v3, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 262
    .line 263
    .line 264
    :cond_c
    :goto_8
    const/4 v7, 0x0

    .line 265
    goto :goto_9

    .line 266
    :catch_0
    const-string v7, "MenuPopupWindow"

    .line 267
    .line 268
    const-string v9, "Could not invoke setTouchModal() on PopupWindow. Oh well."

    .line 269
    .line 270
    invoke-static {v7, v9}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 271
    .line 272
    .line 273
    goto :goto_8

    .line 274
    :cond_d
    move/from16 v7, v17

    .line 275
    .line 276
    invoke-static {v3, v7}, Lp/D0;->a(Landroid/widget/PopupWindow;Z)V

    .line 277
    .line 278
    .line 279
    goto :goto_8

    .line 280
    :goto_9
    invoke-static {v3, v7}, Lp/C0;->a(Landroid/widget/PopupWindow;Landroid/transition/Transition;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 284
    .line 285
    .line 286
    move-result v3

    .line 287
    const/16 v18, 0x1

    .line 288
    .line 289
    add-int/lit8 v3, v3, -0x1

    .line 290
    .line 291
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    check-cast v3, Lo/e;

    .line 296
    .line 297
    iget-object v3, v3, Lo/e;->a:Lp/F0;

    .line 298
    .line 299
    iget-object v3, v3, Lp/A0;->c:Lp/o0;

    .line 300
    .line 301
    const/4 v7, 0x2

    .line 302
    new-array v9, v7, [I

    .line 303
    .line 304
    invoke-virtual {v3, v9}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 305
    .line 306
    .line 307
    new-instance v7, Landroid/graphics/Rect;

    .line 308
    .line 309
    invoke-direct {v7}, Landroid/graphics/Rect;-><init>()V

    .line 310
    .line 311
    .line 312
    iget-object v10, v0, Lo/f;->o:Landroid/view/View;

    .line 313
    .line 314
    invoke-virtual {v10, v7}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 315
    .line 316
    .line 317
    iget v10, v0, Lo/f;->p:I

    .line 318
    .line 319
    const/4 v12, 0x1

    .line 320
    if-ne v10, v12, :cond_f

    .line 321
    .line 322
    const/16 v17, 0x0

    .line 323
    .line 324
    aget v9, v9, v17

    .line 325
    .line 326
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 327
    .line 328
    .line 329
    move-result v3

    .line 330
    add-int/2addr v3, v9

    .line 331
    add-int/2addr v3, v6

    .line 332
    iget v7, v7, Landroid/graphics/Rect;->right:I

    .line 333
    .line 334
    if-le v3, v7, :cond_e

    .line 335
    .line 336
    move/from16 v3, v17

    .line 337
    .line 338
    :goto_a
    const/4 v9, 0x1

    .line 339
    goto :goto_c

    .line 340
    :cond_e
    :goto_b
    const/4 v3, 0x1

    .line 341
    goto :goto_a

    .line 342
    :cond_f
    const/16 v17, 0x0

    .line 343
    .line 344
    aget v3, v9, v17

    .line 345
    .line 346
    sub-int/2addr v3, v6

    .line 347
    if-gez v3, :cond_10

    .line 348
    .line 349
    goto :goto_b

    .line 350
    :cond_10
    const/4 v3, 0x0

    .line 351
    goto :goto_a

    .line 352
    :goto_c
    if-ne v3, v9, :cond_11

    .line 353
    .line 354
    const/4 v9, 0x1

    .line 355
    goto :goto_d

    .line 356
    :cond_11
    const/4 v9, 0x0

    .line 357
    :goto_d
    iput v3, v0, Lo/f;->p:I

    .line 358
    .line 359
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 360
    .line 361
    const/16 v7, 0x1a

    .line 362
    .line 363
    const/4 v10, 0x5

    .line 364
    if-lt v3, v7, :cond_12

    .line 365
    .line 366
    iput-object v2, v8, Lp/A0;->o:Landroid/view/View;

    .line 367
    .line 368
    const/4 v3, 0x0

    .line 369
    const/4 v7, 0x0

    .line 370
    goto :goto_e

    .line 371
    :cond_12
    const/4 v7, 0x2

    .line 372
    new-array v3, v7, [I

    .line 373
    .line 374
    iget-object v12, v0, Lo/f;->n:Landroid/view/View;

    .line 375
    .line 376
    invoke-virtual {v12, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 377
    .line 378
    .line 379
    new-array v7, v7, [I

    .line 380
    .line 381
    invoke-virtual {v2, v7}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 382
    .line 383
    .line 384
    iget v12, v0, Lo/f;->m:I

    .line 385
    .line 386
    and-int/lit8 v12, v12, 0x7

    .line 387
    .line 388
    const/16 v17, 0x0

    .line 389
    .line 390
    if-ne v12, v10, :cond_13

    .line 391
    .line 392
    aget v12, v3, v17

    .line 393
    .line 394
    iget-object v13, v0, Lo/f;->n:Landroid/view/View;

    .line 395
    .line 396
    invoke-virtual {v13}, Landroid/view/View;->getWidth()I

    .line 397
    .line 398
    .line 399
    move-result v13

    .line 400
    add-int/2addr v13, v12

    .line 401
    aput v13, v3, v17

    .line 402
    .line 403
    aget v12, v7, v17

    .line 404
    .line 405
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 406
    .line 407
    .line 408
    move-result v13

    .line 409
    add-int/2addr v13, v12

    .line 410
    aput v13, v7, v17

    .line 411
    .line 412
    :cond_13
    aget v12, v7, v17

    .line 413
    .line 414
    aget v13, v3, v17

    .line 415
    .line 416
    sub-int/2addr v12, v13

    .line 417
    const/16 v18, 0x1

    .line 418
    .line 419
    aget v7, v7, v18

    .line 420
    .line 421
    aget v3, v3, v18

    .line 422
    .line 423
    sub-int/2addr v7, v3

    .line 424
    move v3, v7

    .line 425
    move v7, v12

    .line 426
    :goto_e
    iget v12, v0, Lo/f;->m:I

    .line 427
    .line 428
    and-int/2addr v12, v10

    .line 429
    if-ne v12, v10, :cond_15

    .line 430
    .line 431
    if-eqz v9, :cond_14

    .line 432
    .line 433
    add-int/2addr v7, v6

    .line 434
    goto :goto_f

    .line 435
    :cond_14
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 436
    .line 437
    .line 438
    move-result v2

    .line 439
    sub-int/2addr v7, v2

    .line 440
    goto :goto_f

    .line 441
    :cond_15
    if-eqz v9, :cond_16

    .line 442
    .line 443
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 444
    .line 445
    .line 446
    move-result v2

    .line 447
    add-int/2addr v7, v2

    .line 448
    goto :goto_f

    .line 449
    :cond_16
    sub-int/2addr v7, v6

    .line 450
    :goto_f
    iput v7, v8, Lp/A0;->f:I

    .line 451
    .line 452
    const/4 v9, 0x1

    .line 453
    iput-boolean v9, v8, Lp/A0;->k:Z

    .line 454
    .line 455
    iput-boolean v9, v8, Lp/A0;->j:Z

    .line 456
    .line 457
    invoke-virtual {v8, v3}, Lp/A0;->i(I)V

    .line 458
    .line 459
    .line 460
    goto :goto_11

    .line 461
    :cond_17
    iget-boolean v2, v0, Lo/f;->q:Z

    .line 462
    .line 463
    if-eqz v2, :cond_18

    .line 464
    .line 465
    iget v2, v0, Lo/f;->s:I

    .line 466
    .line 467
    iput v2, v8, Lp/A0;->f:I

    .line 468
    .line 469
    :cond_18
    iget-boolean v2, v0, Lo/f;->r:Z

    .line 470
    .line 471
    if-eqz v2, :cond_19

    .line 472
    .line 473
    iget v2, v0, Lo/f;->t:I

    .line 474
    .line 475
    invoke-virtual {v8, v2}, Lp/A0;->i(I)V

    .line 476
    .line 477
    .line 478
    :cond_19
    iget-object v2, v0, Lo/t;->a:Landroid/graphics/Rect;

    .line 479
    .line 480
    if-eqz v2, :cond_1a

    .line 481
    .line 482
    new-instance v7, Landroid/graphics/Rect;

    .line 483
    .line 484
    invoke-direct {v7, v2}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 485
    .line 486
    .line 487
    goto :goto_10

    .line 488
    :cond_1a
    const/4 v7, 0x0

    .line 489
    :goto_10
    iput-object v7, v8, Lp/A0;->x:Landroid/graphics/Rect;

    .line 490
    .line 491
    :goto_11
    new-instance v2, Lo/e;

    .line 492
    .line 493
    iget v3, v0, Lo/f;->p:I

    .line 494
    .line 495
    invoke-direct {v2, v8, v1, v3}, Lo/e;-><init>(Lp/F0;Lo/l;I)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 499
    .line 500
    .line 501
    invoke-virtual {v8}, Lp/A0;->d()V

    .line 502
    .line 503
    .line 504
    iget-object v2, v8, Lp/A0;->c:Lp/o0;

    .line 505
    .line 506
    invoke-virtual {v2, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 507
    .line 508
    .line 509
    if-nez v11, :cond_1b

    .line 510
    .line 511
    iget-boolean v3, v0, Lo/f;->v:Z

    .line 512
    .line 513
    if-eqz v3, :cond_1b

    .line 514
    .line 515
    iget-object v3, v1, Lo/l;->m:Ljava/lang/CharSequence;

    .line 516
    .line 517
    if-eqz v3, :cond_1b

    .line 518
    .line 519
    const v3, 0x7f0d0012

    .line 520
    .line 521
    .line 522
    const/4 v7, 0x0

    .line 523
    invoke-virtual {v4, v3, v2, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 524
    .line 525
    .line 526
    move-result-object v3

    .line 527
    check-cast v3, Landroid/widget/FrameLayout;

    .line 528
    .line 529
    const v4, 0x1020016

    .line 530
    .line 531
    .line 532
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 533
    .line 534
    .line 535
    move-result-object v4

    .line 536
    check-cast v4, Landroid/widget/TextView;

    .line 537
    .line 538
    invoke-virtual {v3, v7}, Landroid/view/View;->setEnabled(Z)V

    .line 539
    .line 540
    .line 541
    iget-object v1, v1, Lo/l;->m:Ljava/lang/CharSequence;

    .line 542
    .line 543
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 544
    .line 545
    .line 546
    const/4 v1, 0x0

    .line 547
    invoke-virtual {v2, v3, v1, v7}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v8}, Lp/A0;->d()V

    .line 551
    .line 552
    .line 553
    :cond_1b
    return-void
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
