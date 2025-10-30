.class public final synthetic LQ2/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:LQ2/B;

.field public final synthetic b:Lj3/r0;

.field public final synthetic c:LN3/m0;

.field public final synthetic d:LQ2/z;


# direct methods
.method public synthetic constructor <init>(LQ2/B;Lj3/r0;LN3/m0;LQ2/z;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ2/A;->a:LQ2/B;

    iput-object p2, p0, LQ2/A;->b:Lj3/r0;

    iput-object p3, p0, LQ2/A;->c:LN3/m0;

    iput-object p4, p0, LQ2/A;->d:LQ2/z;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    iget-object p1, p0, LQ2/A;->a:LQ2/B;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LQ2/A;->b:Lj3/r0;

    .line 7
    .line 8
    invoke-interface {v0}, Lj3/r0;->M()Li4/v;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Li4/v;->a()Li4/u;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v2, Li4/t;

    .line 17
    .line 18
    iget-object v3, p0, LQ2/A;->d:LQ2/z;

    .line 19
    .line 20
    iget v4, v3, LQ2/z;->b:I

    .line 21
    .line 22
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-static {v4}, LP5/F;->s(Ljava/lang/Object;)LP5/S;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    iget-object v5, p0, LQ2/A;->c:LN3/m0;

    .line 31
    .line 32
    invoke-direct {v2, v5, v4}, Li4/t;-><init>(LN3/m0;Ljava/util/List;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Li4/u;->g(Li4/t;)Li4/u;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v2, v3, LQ2/z;->a:Lj3/F0;

    .line 40
    .line 41
    iget-object v2, v2, Lj3/F0;->b:LN3/m0;

    .line 42
    .line 43
    iget v2, v2, LN3/m0;->c:I

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Li4/u;->h(I)Li4/u;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Li4/u;->a()Li4/v;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-interface {v0, v1}, Lj3/r0;->P(Li4/v;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, v3, LQ2/z;->c:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {p1, v0}, LQ2/B;->p(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p1, LQ2/B;->e:LQ2/D;

    .line 62
    .line 63
    iget-object p1, p1, LQ2/D;->I0:Landroid/widget/PopupWindow;

    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 66
    .line 67
    .line 68
    return-void
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
