.class public final Lp/g;
.super Lo/v;
.source "SourceFile"


# instance fields
.field public final synthetic l:I

.field public final synthetic m:Lp/l;


# direct methods
.method public constructor <init>(Lp/l;Landroid/content/Context;Lo/D;Landroid/view/View;)V
    .locals 7

    const/4 v0, 0x0

    iput v0, p0, Lp/g;->l:I

    .line 8
    iput-object p1, p0, Lp/g;->m:Lp/l;

    const/4 v6, 0x0

    const v2, 0x7f040021

    move-object v1, p0

    move-object v3, p2

    move-object v5, p3

    move-object v4, p4

    .line 9
    invoke-direct/range {v1 .. v6}, Lo/v;-><init>(ILandroid/content/Context;Landroid/view/View;Lo/l;Z)V

    .line 10
    iget-object p2, v5, Lo/D;->A:Lo/n;

    .line 11
    iget p2, p2, Lo/n;->x:I

    const/16 p3, 0x20

    and-int/2addr p2, p3

    if-ne p2, p3, :cond_0

    goto :goto_0

    .line 12
    :cond_0
    iget-object p2, p1, Lp/l;->j:Lp/j;

    if-nez p2, :cond_1

    .line 13
    iget-object p2, p1, Lp/l;->h:Lo/z;

    .line 14
    check-cast p2, Landroid/view/View;

    .line 15
    :cond_1
    iput-object p2, v1, Lo/v;->e:Landroid/view/View;

    .line 16
    :goto_0
    iget-object p1, p1, Lp/l;->x:Li/G;

    .line 17
    iput-object p1, v1, Lo/v;->h:Lo/w;

    .line 18
    iget-object p2, v1, Lo/v;->i:Lo/t;

    if-eqz p2, :cond_2

    .line 19
    invoke-interface {p2, p1}, Lo/x;->h(Lo/w;)V

    :cond_2
    return-void
.end method

.method public constructor <init>(Lp/l;Landroid/content/Context;Lo/l;Landroid/view/View;)V
    .locals 7

    const/4 v0, 0x1

    iput v0, p0, Lp/g;->l:I

    .line 1
    iput-object p1, p0, Lp/g;->m:Lp/l;

    const v2, 0x7f040021

    const/4 v6, 0x1

    move-object v1, p0

    move-object v3, p2

    move-object v5, p3

    move-object v4, p4

    .line 2
    invoke-direct/range {v1 .. v6}, Lo/v;-><init>(ILandroid/content/Context;Landroid/view/View;Lo/l;Z)V

    const p2, 0x800005

    .line 3
    iput p2, v1, Lo/v;->f:I

    .line 4
    iget-object p1, p1, Lp/l;->x:Li/G;

    .line 5
    iput-object p1, v1, Lo/v;->h:Lo/w;

    .line 6
    iget-object p2, v1, Lo/v;->i:Lo/t;

    if-eqz p2, :cond_0

    .line 7
    invoke-interface {p2, p1}, Lo/x;->h(Lo/w;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 3

    .line 1
    iget v0, p0, Lp/g;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lp/g;->m:Lp/l;

    .line 7
    .line 8
    iget-object v1, v0, Lp/l;->c:Lo/l;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {v1, v2}, Lo/l;->c(Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    iput-object v1, v0, Lp/l;->t:Lp/g;

    .line 18
    .line 19
    invoke-super {p0}, Lo/v;->c()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    const/4 v0, 0x0

    .line 24
    iget-object v1, p0, Lp/g;->m:Lp/l;

    .line 25
    .line 26
    iput-object v0, v1, Lp/l;->u:Lp/g;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    iput v0, v1, Lp/l;->y:I

    .line 30
    .line 31
    invoke-super {p0}, Lo/v;->c()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
