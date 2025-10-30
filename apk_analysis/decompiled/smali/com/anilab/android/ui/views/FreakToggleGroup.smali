.class public final Lcom/anilab/android/ui/views/FreakToggleGroup;
.super Lcom/google/android/material/button/MaterialButtonToggleGroup;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, Lcom/google/android/material/button/MaterialButtonToggleGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 7
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
.method public final onMeasure(II)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/android/material/button/MaterialButtonToggleGroup;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    new-instance p1, LB7/r;

    .line 5
    .line 6
    const/4 p2, 0x1

    .line 7
    invoke-direct {p1, p2, p0}, LB7/r;-><init>(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    sget-object p2, Lr2/d;->a:Lr2/d;

    .line 11
    .line 12
    new-instance v0, LV7/g;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, p1, v1, p2}, LV7/g;-><init>(LV7/j;ZLO7/l;)V

    .line 16
    .line 17
    .line 18
    new-instance p1, LV7/f;

    .line 19
    .line 20
    invoke-direct {p1, v0}, LV7/f;-><init>(LV7/g;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {p1}, LV7/f;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-eqz p2, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1}, LV7/f;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    check-cast p2, Lcom/google/android/material/button/MaterialButton;

    .line 34
    .line 35
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/16 v1, 0x8

    .line 40
    .line 41
    if-ne v0, v1, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {p2}, Lcom/google/android/material/button/MaterialButton;->getShapeAppearanceModel()LF5/m;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, LF5/m;->e()LF5/l;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const v2, 0x7f0700b5

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    new-instance v2, LF5/a;

    .line 64
    .line 65
    invoke-direct {v2, v1}, LF5/a;-><init>(F)V

    .line 66
    .line 67
    .line 68
    iput-object v2, v0, LF5/l;->e:LF5/c;

    .line 69
    .line 70
    new-instance v2, LF5/a;

    .line 71
    .line 72
    invoke-direct {v2, v1}, LF5/a;-><init>(F)V

    .line 73
    .line 74
    .line 75
    iput-object v2, v0, LF5/l;->h:LF5/c;

    .line 76
    .line 77
    new-instance v2, LF5/a;

    .line 78
    .line 79
    invoke-direct {v2, v1}, LF5/a;-><init>(F)V

    .line 80
    .line 81
    .line 82
    iput-object v2, v0, LF5/l;->f:LF5/c;

    .line 83
    .line 84
    new-instance v2, LF5/a;

    .line 85
    .line 86
    invoke-direct {v2, v1}, LF5/a;-><init>(F)V

    .line 87
    .line 88
    .line 89
    iput-object v2, v0, LF5/l;->g:LF5/c;

    .line 90
    .line 91
    invoke-virtual {v0}, LF5/l;->a()LF5/m;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {p2, v0}, Lcom/google/android/material/button/MaterialButton;->setShapeAppearanceModel(LF5/m;)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_1
    return-void
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
.end method
