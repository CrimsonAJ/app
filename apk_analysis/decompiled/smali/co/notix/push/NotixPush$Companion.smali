.class public final Lco/notix/push/NotixPush$Companion;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/notix/push/NotixPush;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/notix/push/NotixPush;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# static fields
.field static final synthetic $$INSTANCE:Lco/notix/push/NotixPush$Companion;


# instance fields
.field private final synthetic $$delegate_0:Lco/notix/push/NotixPush;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/notix/push/NotixPush$Companion;

    invoke-direct {v0}, Lco/notix/push/NotixPush$Companion;-><init>()V

    sput-object v0, Lco/notix/push/NotixPush$Companion;->$$INSTANCE:Lco/notix/push/NotixPush$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lco/notix/wq;->w()Lco/notix/ch;

    move-result-object v0

    iput-object v0, p0, Lco/notix/push/NotixPush$Companion;->$$delegate_0:Lco/notix/push/NotixPush;

    return-void
.end method


# virtual methods
.method public addAudience(Ljava/lang/String;)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "audience"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/push/NotixPush$Companion;->$$delegate_0:Lco/notix/push/NotixPush;

    invoke-interface {v0, p1}, Lco/notix/push/NotixPush;->addAudience(Ljava/lang/String;)V

    return-void
.end method

.method public deleteAudience(Ljava/lang/String;)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "audience"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/push/NotixPush$Companion;->$$delegate_0:Lco/notix/push/NotixPush;

    invoke-interface {v0, p1}, Lco/notix/push/NotixPush;->deleteAudience(Ljava/lang/String;)V

    return-void
.end method

.method public init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notixAppId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notixToken"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/push/NotixPush$Companion;->$$delegate_0:Lco/notix/push/NotixPush;

    invoke-interface {v0, p1, p2, p3}, Lco/notix/push/NotixPush;->init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lco/notix/domain/RequestVars;)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notixAppId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notixToken"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/push/NotixPush$Companion;->$$delegate_0:Lco/notix/push/NotixPush;

    invoke-interface {v0, p1, p2, p3, p4}, Lco/notix/push/NotixPush;->init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lco/notix/domain/RequestVars;)V

    return-void
.end method

.method public setNotificationModifier(Lco/notix/push/NotixNotificationModifier;)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "modifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/push/NotixPush$Companion;->$$delegate_0:Lco/notix/push/NotixPush;

    invoke-interface {v0, p1}, Lco/notix/push/NotixPush;->setNotificationModifier(Lco/notix/push/NotixNotificationModifier;)V

    return-void
.end method

.method public setTargetEventHandler(Lco/notix/push/NotixTargetEventHandler;)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "handler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/push/NotixPush$Companion;->$$delegate_0:Lco/notix/push/NotixPush;

    invoke-interface {v0, p1}, Lco/notix/push/NotixPush;->setTargetEventHandler(Lco/notix/push/NotixTargetEventHandler;)V

    return-void
.end method
