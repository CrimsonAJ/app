.class public final Lo2/j;
.super LM1/r;
.source "SourceFile"


# instance fields
.field public final f:LL2/A;

.field public final g:Lb8/Q;


# direct methods
.method public constructor <init>(LL2/A;)V
    .locals 1

    .line 1
    const-string v0, "playerSettingsUseCase"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, LM1/r;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lo2/j;->f:LL2/A;

    .line 10
    .line 11
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-static {p1}, Lb8/M;->c(Ljava/lang/Object;)Lb8/Q;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lo2/j;->g:Lb8/Q;

    .line 18
    .line 19
    new-instance p1, Lo2/h;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-direct {p1, p0, v0}, Lo2/h;-><init>(Lo2/j;LE7/d;)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-virtual {p0, v0, p1}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 27
    .line 28
    .line 29
    return-void
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
